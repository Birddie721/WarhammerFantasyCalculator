/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 * V0.1
 */

package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.stage.Stage;
import main.armies.Army;
import main.armies.beastmen.Beastmen;
import main.armies.bretonnia.Bretonnia;
import main.armies.chaosDwarfs.ChaosDwarfs;
import main.armies.daemonsOfChaos.ChaosDaemons;
import main.armies.darkElves.DarkElves;
import main.armies.dwarfs.Dwarfs;
import main.armies.empire.Empire;
import main.armies.highElves.HighElves;
import main.armies.lizardmen.Lizardmen;
import main.armies.ogres.Ogres;
import main.armies.orcsAndGoblins.OrcsAndGoblins;
import main.armies.skaven.Skaven;
import main.armies.tombKings.TombKings;
import main.armies.vampireCounts.VampireCounts;
import main.armies.warriorsOfChaos.WarriorsOfChaos;
import main.armies.woodElves.WoodElves;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class CalculatorApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Army Calculator");
        
        List<String> armies = new ArrayList<>();
        armies.add("Beastmen");
        armies.add("Bretonnia");
        armies.add("Chaos Dwarfs");
        armies.add("Daemons of Chaos");
        armies.add("Dark Elves");
        armies.add("Dwarfs");
        armies.add("Empire");
        armies.add("High Elves");
        armies.add("Lizardmen");
        armies.add("Ogres");
        armies.add("Orcs & Goblins");
        armies.add("Skaven");
        armies.add("Tomb Kings");
        armies.add("Vampire Counts");
        armies.add("Warriors Of Chaos");
        armies.add("Wood Elves");

        TextField pointsField = new TextField();
        TextField unitWidthField = new TextField();
        ComboBox<String> attackingArmyDropdown = new ComboBox<>();
        ComboBox<String> defendingArmyDropdown = new ComboBox<>();
        ComboBox<String> attackingUnitDropdown = new ComboBox<>();
        ComboBox<String> defendingUnitDropdown = new ComboBox<>();
        ComboBox<String> attackingEquipmentDropdown = new ComboBox<>();
        ComboBox<String> defendingEquipmentDropdown = new ComboBox<>();
        Button simulateButton = new Button("Simulate");
        TextField numSimulationsField = new TextField();
        Label outcomeLabel = new Label("");

        
        VBox root = new VBox(10);
        root.getChildren().addAll(
            new Label("Enter Points Value:"),
            pointsField,
            new Label("Enter Width for Units:"),
            unitWidthField,
            new Label("Select Charging Army:"),
            attackingArmyDropdown,
            new Label("Select Charging Unit:"),
            attackingUnitDropdown,
            new Label("Select Charging Unit's Equipment"),
            attackingEquipmentDropdown,
            new Label("Select Holding Army:"),
            defendingArmyDropdown,
            new Label("Select Holding Unit:"),
            defendingUnitDropdown,
            new Label("Select Holding Unit's Equipment:"),
            defendingEquipmentDropdown,
            new Label("Number of simulations to run:"),
            numSimulationsField,
            simulateButton,
            outcomeLabel
        );

        Scene scene = new Scene(root, 700, 700);
        primaryStage.setScene(scene);
        primaryStage.show();
        
        attackingArmyDropdown.getItems().addAll(armies);
        defendingArmyDropdown.getItems().addAll(armies);
        
        //pointsField.setText("500");
        //numSimulationsField.setText("500");
        unitWidthField.setText("5");
        
        
        attackingArmyDropdown.setOnAction(event -> {
            String selectedArmy = attackingArmyDropdown.getValue();
            updateUnitDropdown(attackingUnitDropdown, selectedArmy);
        });

        defendingArmyDropdown.setOnAction(event -> {
            String selectedArmy = defendingArmyDropdown.getValue();
            updateUnitDropdown(defendingUnitDropdown, selectedArmy);
        });
        
        attackingUnitDropdown.setOnAction(event -> {
        	String selectedArmy = attackingArmyDropdown.getValue();
        	String selectedUnit = attackingUnitDropdown.getValue();
        	updateEquipmentDropdown(attackingEquipmentDropdown, selectedArmy, selectedUnit);
        });
        
        defendingUnitDropdown.setOnAction(event -> {
        	String selectedArmy = defendingArmyDropdown.getValue();
        	String selectedUnit = defendingUnitDropdown.getValue();
        	updateEquipmentDropdown(defendingEquipmentDropdown, selectedArmy, selectedUnit);
        });
        
        
        
        
        simulateButton.setOnAction(event -> {
        	try {
        		int rankWidth = Integer.parseInt(unitWidthField.getText());
        		if(rankWidth<5) {
        			rankWidth=5;
        			unitWidthField.setText("5");
        		}
        		Unit attacker = null;
        		Unit defender = null;
        		int points = Integer.parseInt(pointsField.getText());
        		int simulations = Integer.parseInt(numSimulationsField.getText());
        		int attackerWins = 0;
        		int defenderWins = 0;
        		int win = 0;
        		for(int i = 0; i < simulations; i++) {
        			attacker = createUnitFromSelected(attackingArmyDropdown.getValue(), attackingUnitDropdown.getValue());
                    defender = createUnitFromSelected(defendingArmyDropdown.getValue(), defendingUnitDropdown.getValue());
                    attacker.setWeapon(createWeaponFromSelected(attackingEquipmentDropdown.getValue()));
                    attacker.setWeaponCostIndex(attackingEquipmentDropdown.getSelectionModel().getSelectedIndex());
                    defender.setWeapon(createWeaponFromSelected(defendingEquipmentDropdown.getValue()));
                    defender.setWeaponCostIndex(defendingEquipmentDropdown.getSelectionModel().getSelectedIndex());
                    attacker.setRankWidth(rankWidth);
            		defender.setRankWidth(rankWidth);
        			BattleSimulator combatSimulator = new BattleSimulator();
                    win = combatSimulator.simulate(attacker, defender, points);
                    if(win==1) {
                    	attackerWins++;
                    }else {
                    	defenderWins++;
                    }
        		}
        		if(attackerWins > defenderWins) {
        			outcomeLabel.setText(attacker.getName() + " wins the simulation, winning " + attackerWins + " times, while " + defender.getName() + " only won " + defenderWins + " times out of " + simulations + " simulations.");
        		}else if(defenderWins > attackerWins) {
        			outcomeLabel.setText(defender.getName() + " wins the simulation, winning " + defenderWins + " times, while " + attacker.getName() + " only won " + attackerWins + " times out of " + simulations + " simulations.");
        		}else {
        			outcomeLabel.setText(attacker.getName() + " and " + defender.getName() + " tied in number of wins at " + attackerWins + " out of " + simulations + " simulations.");
        		}
        	}catch(Exception e) {
        		JOptionPane.showMessageDialog(null, "Error with selected values, please check entries and try again.", "Invalid Entries", JOptionPane.ERROR_MESSAGE);
        		System.out.println(e);
        	}
        });
    }
    
    

    private Unit createUnitFromSelected(String armyName, String unitName) {
        Map<String, Army> armies = new HashMap<>();
        armies = createArmyHashMap(armies);
        if (armies.containsKey(armyName)) {
            Army selectedArmy = armies.get(armyName);
            for (Unit unit : selectedArmy.getUnits()) {
                if (unit.getName().equals(unitName)) {
                    return unit;
                }
            }
        }
        return null;
    }
    
    private Army createArmyFromSelected(String armyName) {
            Map<String, Army> armies = new HashMap<>();
            armies = createArmyHashMap(armies);
            if (armies.containsKey(armyName)) {
                Army selectedArmy = armies.get(armyName);
                return selectedArmy;
            }
            return null;
    }
    
    private Weapon createWeaponFromSelected(String weapon) {
    	Map<String, Weapon> weapons = new HashMap<>();
    	weapons.put("Hand Weapon", Weapon.HandWeapon);
    	weapons.put("Flail", Weapon.Flail);
    	weapons.put("Great Weapon", Weapon.GreatWeapon);
    	weapons.put("Halberd", Weapon.Halberd);
    	weapons.put("Lance Mounted", Weapon.LanceMounted);
    	weapons.put("Morning Star", Weapon.MorningStar);
    	weapons.put("Spear", Weapon.Spear);
    	weapons.put("Spear Mounted", Weapon.SpearMounted);
    	weapons.put("Additional Hand Weapon", Weapon.AdditionalHandWeapons);
    	weapons.put("Hand Weapon and Shield", Weapon.HandWeaponAndShield);
    	weapons.put("Spear and Shield", Weapon.SpearAndShield);
    	
    	if(weapons.containsKey(weapon)) {
    		Weapon selectedWeapon = weapons.get(weapon);
    		return selectedWeapon;
    	}
    	return null;
    }
    
    
    private void updateUnitDropdown(ComboBox<String> unitDropdown, String selectedArmy) {
        unitDropdown.getItems().clear();

        if (selectedArmy != null && !selectedArmy.isEmpty()) {
            List<String> units = new ArrayList<>();
            for (Unit unit : createArmyFromSelected(selectedArmy).getUnits()) {
            	units.add(unit.getName());
            }
            unitDropdown.getItems().addAll(units);
        }
    }
    
    private void updateEquipmentDropdown(ComboBox<String> equipmentDropdown, String selectedArmy, String selectedUnit) {
    	equipmentDropdown.getItems().clear();
    	
    	if (selectedUnit != null && !selectedUnit.isEmpty()) {
            List<String> weapons = new ArrayList<>();
            for (Weapon weapon : createUnitFromSelected(selectedArmy, selectedUnit).getWeapons()) {
            	weapons.add(weapon.getWeaponName());
            }
            equipmentDropdown.getItems().addAll(weapons);
            equipmentDropdown.setValue(equipmentDropdown.getItems().get(0));
        }
    }
    
    private Map<String,Army> createArmyHashMap(Map<String, Army> armies){
    	armies.put("Beastmen", new Beastmen());
    	armies.put("Bretonnia", new Bretonnia());
    	armies.put("Chaos Dwarfs", new ChaosDwarfs());
    	armies.put("Daemons of Chaos", new ChaosDaemons());
    	armies.put("Dark Elves", new DarkElves());
    	armies.put("Dwarfs", new Dwarfs());
    	armies.put("Empire", new Empire());
    	armies.put("High Elves", new HighElves());
    	armies.put("Lizardmen", new Lizardmen());
    	armies.put("Ogres", new Ogres());
    	armies.put("Orcs & Goblins", new OrcsAndGoblins());
    	armies.put("Skaven", new Skaven());
    	armies.put("Tomb Kings", new TombKings());
    	armies.put("Vampire Counts", new VampireCounts());
    	armies.put("Warriors Of Chaos", new WarriorsOfChaos());
    	armies.put("Wood Elves", new WoodElves());
    	return armies;
    }
    
    
}
