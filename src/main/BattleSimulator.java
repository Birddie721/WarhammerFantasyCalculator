/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main;

import java.util.Random;

import main.armies.beastmen.BeastmanUnit;
import main.armies.daemonsOfChaos.DaemonsUnit;
import main.armies.daemonsOfChaos.Khorne;
import main.armies.daemonsOfChaos.Nurgle;
import main.armies.daemonsOfChaos.Slaanesh;
import main.armies.daemonsOfChaos.Tzeentch;
import main.armies.darkElves.DarkElfUnit;
import main.armies.dwarfs.DwarfUnit;
import main.armies.dwarfs.Ironbreakers;
import main.armies.dwarfs.Slayers;
import main.armies.highElves.ElfUnit;
import main.armies.highElves.HighElfUnit;
import main.armies.lizardmen.LizardUnit;
import main.armies.lizardmen.PredatoryFighterUnit;
import main.armies.orcsAndGoblins.GoblinUnit;
import main.armies.orcsAndGoblins.GreenskinUnit;
import main.armies.orcsAndGoblins.NightGoblins;
import main.armies.orcsAndGoblins.OrcUnit;
import main.armies.skaven.SkavenUnit;
import main.armies.tombKings.Undead;
import main.armies.warriorsOfChaos.ChaosUnit;
import main.armies.woodElves.WoodElfUnit;

public class BattleSimulator {
	boolean combat = true;
	int combatRound = 1;
	public int simulate(Unit attacker, Unit defender, int points) {
		attacker.setIsAttacker(true);
		doWeaponAttribs(attacker);
		doWeaponAttribs(defender);
		attacker.setUnits((int) (points/attacker.getPoints()));
		defender.setUnits((int) (points/defender.getPoints()));
		while(attacker.getUnits() > 0 && defender.getUnits() > 0 && combat) {
			initiative(attacker, defender);
			combatRound++;
		}
		if (attacker.getUnits() <= 0) {
			//System.out.println(attacker.getName() + " were wiped out. " + defender.getName() + " have " + defender.getUnits() + " remaining");
			return -1;
		}else if(defender.getUnits() <= 0){
			//System.out.println(defender.getName() + " were wiped out. " + attacker.getName() + " have " + attacker.getUnits() + " remaining");
			return 1;
		}else if(attacker.getLD() <= 0) {
			//System.out.println(attacker.getName() + " of " + attacker.getUnits() + " ran away! " + defender.getName() + " has " + defender.getUnits() + " remaining");
			return -1;
		}else {
			//System.out.println(defender.getName() + " of " + defender.getUnits() + " ran away! " + attacker.getName() + " has " + attacker.getUnits() + " remaining");
			return 1;
		}
	}
	
	//This method adds the weapon attributes to each unit
	public void doWeaponAttribs(Unit unit) {
		unit.setPoints(unit.getPoints() + unit.getWeaponCost());
		switch(unit.getWeapon().getWeaponName()) {
		case "Hand Weapon":
			break;
		case "Flail":
			//see firstRoundStrengthBonus in attack method
			break;
		case "Great Weapon":
			unit.setS(unit.getS() +2);
			if(unit.isAlwaysStrikesFirst()) {
				unit.setAlwaysStrikesFirst(false);
			}else{
				unit.setAlwaysStrikesLast(true);
			}
			break;
		case "Halberd":
			unit.setS(unit.getS() +1);
			break;
		case "Lance Mounted":
			if(unit.isAttacker) {
				//mounted currently unsupported
			}
			break;
		case "Morning Star":
			//nothing uses a morningstar, but see firstRoundStrengthBonus in attack method
			break;
		case "Spear":
			unit.setAttackInExtraRanks(unit.getAttackInExtraRanks() +1);
			break;
		case "Spear Mounted":
			if(unit.isAttacker) {
				//mounted currently unsupported
			}
			break;
		case "Additional Hand Weapon":
			unit.setA(unit.getA()+1);
			break;
		case "Hand Weapon and Shield":
			if(unit.getWardSave() == 7) {unit.setWardSave(6);}
			unit.setArmorSave(unit.getArmorSave()-1);
			break;
		case "Spear and Shield":
			unit.setArmorSave(unit.getArmorSave()-1);
			unit.setAttackInExtraRanks(unit.getAttackInExtraRanks()+1);
		}
		
		if (unit instanceof WoodElfUnit) {
			if(unit.getWeapon() == Weapon.Spear || unit.getWeapon() == Weapon.SpearAndShield) {
				//Asrai spear
				unit.setArmorPierce(1);
			}
		}
	}
	
	//This method begins combat by determining the striking order for the two units by comparing initiative
	public void initiative(Unit charger, Unit defender) {
		if(charger.isAlwaysStrikesFirst() || defender.isAlwaysStrikesFirst()) {
			if(charger.isAlwaysStrikesFirst() && defender.isAlwaysStrikesFirst()) {
				//simultaneous
				attack(charger, defender);
			}else if(charger.isAlwaysStrikesFirst()) {
				//charger attacks first
				attack(charger, defender);
			}else {
				//defender attacks first
				attack(defender, charger);
			}
		}else if(charger.isAlwaysStrikesLast() || defender.isAlwaysStrikesLast()) {
			if(charger.isAlwaysStrikesLast() && defender.isAlwaysStrikesLast()) {
				//simultaneous
				attack(charger, defender);
			}else if(defender.isAlwaysStrikesLast()) {
				//charger attacks first
				attack(charger, defender);
			}else {
				//defender attacks first
				attack(defender, charger);
			}
			
		}else {
			if(charger.getI() > defender.getI()) {
				//charger attacks first
				attack(charger, defender);
			}else if(charger.getI() < defender.getI()) {
				//defender attacks first
				attack(defender, charger);
			}else {
				//simultaneous
				attack(charger, defender);
			}
		}
	}
	
	//this method is used when one unit attacks the other
	public void attack(Unit attacker, Unit defender){
		Random random = new Random();
		int die = random.nextInt(6) +1;
		int die2 = random.nextInt(6) +1;
		int die3 = random.nextInt(6) +1;
		int attacks = getUnitAttacks(attacker);
		int toHit;
		int toWound;
		int poison = 0;
		int attackerDealtWounds;
		int attackWS = attacker.getWS();
		int defendWS = defender.getWS();
		boolean simultaneous = false;
		int firstRoundStrengthBonus;
		int attackerLD = attacker.getLD();
		int defenderLD = defender.getLD();
		int attackerFullRanks = ((attacker.getUnits() / attacker.getRankWidth())-1);
		int defenderFullRanks = ((defender.getUnits() / defender.getRankWidth())-1);
		boolean beastmanFrenzyAttacker = false;
		boolean beastmanFrenzyDefender = false;
		
		
		
		if(attacker instanceof ChaosUnit) {
			giftsOfChaos((ChaosUnit) attacker);
		}
		if(defender instanceof ChaosUnit) {
			giftsOfChaos((ChaosUnit) attacker);
		}
		
		//find if any combatant hates the other
		hate(attacker,defender);
		hate(defender,attacker);
		
		//Beastmen Primal Fury
		if(attacker instanceof BeastmanUnit) {
			die = random.nextInt(6)+1;
			die2 = random.nextInt(6)+1;
			attacker.setHatred(false);
			if(die+die2==2) {
				beastmanFrenzyAttacker = true;
				attacker.setHatred(true);
				attacker.setFrenzy(true);
			}else if((die+die2)<attackerLD) {
				attacker.setHatred(true);
			}
		}
		if(defender instanceof BeastmanUnit) {
			die = random.nextInt(6)+1;
			die2 = random.nextInt(6)+1;
			defender.setHatred(false);
			if(die+die2==2) {
				beastmanFrenzyDefender = true;
				defender.setHatred(true);
				defender.setFrenzy(true);
			}else if((die+die2)<attackerLD) {
				defender.setHatred(true);
			}
		}
		
		if(attacker.isAlwaysStrikesFirst() && defender.isAlwaysStrikesFirst()) {
			simultaneous = true;
		}else if(attacker.isAlwaysStrikesLast() && defender.isAlwaysStrikesLast()) {
			simultaneous = true;
		}else if(attacker.getI() == defender.getI()){
			simultaneous = true;
		}
		
		if(defender instanceof SkavenUnit) {
			defenderLD += defenderFullRanks;
		}
		if(attacker instanceof SkavenUnit) {
			attackerLD += attackerFullRanks;
		}
		//goblins fear elves
		if(attacker instanceof GoblinUnit && defender instanceof ElfUnit) {
			defender.setCausesFear(true);
		}else if(attacker instanceof ElfUnit && defender instanceof GoblinUnit) {
			attacker.setCausesFear(true);
		}
		
		if(attacker.isCausesFear() || defender.isCausesFear()) {
			if(attacker.isCausesFear() && defender.isCausesFear()) {
			}else if(attacker.isCausesFear() && !defender.isImmuneToPsychology()) {
				if(defender instanceof LizardUnit) {
					//Cold Blooded
					if(die >= die2 && die >= die3) {
						if((die3+die2)>defenderLD) {
							defender.setWS(1);
						}
					}else if(die2 >= die && die2 >= die3){
						if((die3+die)>defenderLD) {
							defender.setWS(1);
						}
					}else{
						if((die+die2)>defenderLD) {
							defender.setWS(1);
						}
					}
				}else if((die+die2)>defenderLD) {
					defender.setWS(1);
				}
			}else if(defender.isCausesFear() && !attacker.isImmuneToPsychology()){
				if(attacker instanceof LizardUnit) {
					//Cold Blooded
					if(die >= die2 && die >= die3) {
						if((die3+die2)>attackerLD) {
							attacker.setWS(1);
						}
					}else if(die2 >= die && die2 >= die3){
						if((die3+die)>attackerLD) {
							attacker.setWS(1);
						}
					}else{
						if((die+die2)>attackerLD) {
							attacker.setWS(1);
						}
					}
				}else if((die+die2)>attackerLD) {
					attacker.setWS(1);
				}
			}
		}
		//*************Attacker swings into defender****************************************************
		toHit = toHit(attacker.getWS(), defender.getWS());
		toHit -= defender.getToHitMod();
		
		
		for(int i = attacks; i > 0; i--) {
			die = random.nextInt(6)+1;
			if(attacker instanceof PredatoryFighterUnit && die==6) {
				attacks++;
				i++;
			}
			if(attacker.isPoisonedAttacks() && die==6) {
				poison++;
				attacks--;
			}else if(die<toHit) {
				if(((attacker.isAlwaysStrikesFirst() && !defender.isAlwaysStrikesFirst()) && (attacker.getI() >= defender.getI())) || (attacker.hasHatred() && combatRound == 1)|| (attacker.hasHatred() && attacker instanceof BeastmanUnit)) {
					//reroll miss for ASF + higher initiative or hatred
					die = random.nextInt(6)+1;
					if(attacker.isPoisonedAttacks() && die==6) {
						poison++;
						attacks--;
					}else if(die<toHit) {
						attacks--;
					}
				}else{
					attacks--;
				}
			}
		}
		//at this point all attacks have hit
		if(attacker.isAttacker || attacker instanceof OrcUnit || attacker.getWeapon() == Weapon.Flail || attacker.getWeapon() == Weapon.MorningStar) {
			if(attacker.isAttacker() && (attacker instanceof DwarfUnit || attacker instanceof Khorne)) {
				firstRoundStrengthBonus = 1;
			}else if(attacker instanceof OrcUnit || attacker.getWeapon() == Weapon.MorningStar) {
				firstRoundStrengthBonus = 1;
			}else if(attacker.getWeapon() == Weapon.Flail) {
				firstRoundStrengthBonus = 2;
			}else {
				firstRoundStrengthBonus = 0;
			}
		}else {
			firstRoundStrengthBonus = 0;
		}
		if(combatRound == 1) {
			//Strength bonus in first round of combat
			toWound = toWound(attacker.getS() + firstRoundStrengthBonus ,defender.getT());
		}else {
			toWound = toWound(attacker.getS(),defender.getT());
		}
		for(int i = attacks; i > 0; i--) {
			die = random.nextInt(6)+1;
			if(die>=toWound) {
				if(attacker.isKillingBlow() && die==6) {
				}else {
					if(doesArmorSave(attacker,defender)) {
						attacks--;
					}
				}
			}else if(attacker instanceof DarkElfUnit && die==1){
				die = random.nextInt(6)+1;
				if(die>=toWound) {
					if(attacker.isKillingBlow() && die==6) {
					}else {
						if(doesArmorSave(attacker,defender)) {
							attacks--;
						}
					}
				}else {
					attacks--;
				}
			}else{
				attacks--;
			}
		}
		//since the poisoned hits were subtracted earlier, they will be added back in here if they are not armor saved
		for(int i = poison; i > 0; i--) {
			if(doesArmorSave(attacker,defender)) {
			}else {
				attacks++;
			}
		}
		//at this point all attacks have wounded through armor saves
		for(int i = attacks; i > 0; i--) {
			if(doesWardSave(defender)) {
				attacks--;
			}
		}
		//System.out.println(attacker + " deals " + attacks + " wounds.");
		attackerDealtWounds = attacks;
		int slayerDeaths = 0;
		if(defender instanceof Slayers) {
			slayerDeaths = attacks;
		}
		if (!simultaneous) {
			defender.setUnits(defender.getUnits()-attacks);
		}	

		//****************Defender swings into attacker****************************************************
		attacks=getUnitAttacks(defender);
		toHit = toHit(defender.getWS(), attacker.getWS());
		toHit -= attacker.getToHitMod();
		poison = 0;

		for(int i = attacks; i > 0; i--) {
			die = random.nextInt(6)+1;
			if(defender.isPoisonedAttacks() && die==6) {
				poison++;
				attacks--;
			}else if(die<toHit) {
				if(((!attacker.isAlwaysStrikesFirst() && defender.isAlwaysStrikesFirst()) && (defender.getI() >= attacker.getI())) || (defender.hasHatred() && combatRound == 1) || (defender.hasHatred() && defender instanceof BeastmanUnit)) {
					//reroll miss for ASF + higher initiative or hatred
					die = random.nextInt(6)+1;
					if(defender.isPoisonedAttacks() && die==6) {
						poison++;
						attacks--;
					}else if(die<toHit) {
						attacks--;
					}
				}else{
					attacks--;
				}
			}
		}
		//at this point all attacks have hit
		if(defender.isAttacker || defender instanceof OrcUnit || defender.getWeapon() == Weapon.Flail || defender.getWeapon() == Weapon.MorningStar) {
			if(defender.isAttacker() && (defender instanceof DwarfUnit || defender instanceof Khorne)) {
				firstRoundStrengthBonus = 1;
			}else if(defender instanceof OrcUnit || defender.getWeapon() == Weapon.MorningStar) {
				firstRoundStrengthBonus = 1;
			}else if(defender.getWeapon() == Weapon.Flail) {
				firstRoundStrengthBonus = 2;
			}else {
				firstRoundStrengthBonus = 0;
			}
		}else {
			firstRoundStrengthBonus = 0;
		}
		if(combatRound == 1) {
			//Strength bonus in first round of combat
			toWound = toWound(defender.getS() + firstRoundStrengthBonus ,attacker.getT());
		}else {
			toWound = toWound(defender.getS(),attacker.getT());
		}
		for(int i = attacks; i > 0; i--) {
			die = random.nextInt(6)+1;
			if(die>=toWound) {
				if(defender.isKillingBlow() && die==6) {
				}else {
					if(doesArmorSave(defender,attacker)) {
						attacks--;
					}
				}
			}else if(defender instanceof DarkElfUnit && die==1){
				die = random.nextInt(6)+1;
				if(die>=toWound) {
					if(defender.isKillingBlow() && die==6) {
					}else {
						if(doesArmorSave(defender,attacker)) {
							attacks--;
						}
					}
				}else {
					attacks--;
				}
			}else {
				attacks--;
			}
		}
		//since the poisoned hits were subtracted earlier, they will be added back in here if they are not armor saved
		for(int i = poison; i > 0; i--) {
			if(doesArmorSave(defender,attacker)) {
			}else {
				attacks++;
			}
		}
		//at this point all attacks have wounded through armor saves
		for(int i = attacks; i > 0; i--) {
			if(doesWardSave(attacker)) {
				attacks--;
			}
		}
		if(attacker instanceof Slayers) {
			slayerDeaths = attacks;
			attackerDealtWounds += slayerDeathblow(attacker, defender, slayerDeaths);
		}else if(defender instanceof Slayers) {
			attacks += slayerDeathblow(defender, attacker, slayerDeaths);
		}
		//System.out.println(defender + " dealt " + attacks + " wounds.");
		attacker.setUnits(attacker.getUnits() - attacks);
		if (simultaneous) {
			defender.setUnits(defender.getUnits()-attacks);
		}	
		
		if(attacker.getUnits() < 0) {
			attacker.setUnits(0);
		}
		if(defender.getUnits() < 0) {
			defender.setUnits(0);
		}
		
		attacker.setWS(attackWS);
		defender.setWS(defendWS);
		
		if(beastmanFrenzyAttacker) {
			attacker.setFrenzy(false);
		}
		if(beastmanFrenzyDefender) {
			defender.setFrenzy(false);
		}
		
		combatResolution(attackerDealtWounds, attacks, attacker, defender);
		
		
		
	}

	
	//this method returns the number of attacks for each unit
	public int getUnitAttacks(Unit attacker) {
		int attacks;
		int fullRanks = (attacker.getUnits() / attacker.getRankWidth());
		int attackInRanks = 2 + attacker.getAttackInExtraRanks();
		int attacksPerModel = attacker.getA();
		if(attacker.isFrenzy()) {
			attacksPerModel++;
		}
		if(attacker.getRankWidth()>=10) {
			attackInRanks++;
		}
		if(attacker.getUnits() < 5) {
			return (attacker.getUnits() * attacksPerModel);
		}else if(fullRanks < 2) {
			attacks = (attacksPerModel * attacker.getRankWidth());
			attacks += (attacker.getUnits() - attacker.getRankWidth());
			return attacks;
		}else if(attackInRanks == 2) {
			attacks = (attacksPerModel * attacker.getRankWidth());
			attacks += (attacker.getRankWidth());
			return attacks;
		}else if(attackInRanks == 3) {
			if(fullRanks < 3) {
				attacks = (attacksPerModel * attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				attacks += (attacker.getUnits() - (2 * attacker.getRankWidth()));
				return attacks;
			}else {
				attacks = (attacksPerModel * attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				return attacks;
			}
		}else if(attackInRanks == 4){
			if(fullRanks < 4) {
				attacks = (attacksPerModel * attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				attacks += (attacker.getUnits() - (3 * attacker.getRankWidth()));
				return attacks;
			}else {
				attacks = (attacksPerModel * attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				return attacks;
			}
		}else {
			if(fullRanks < 5) {
				attacks = (attacksPerModel * attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				attacks += (attacker.getUnits() - (4 * attacker.getRankWidth()));
				return attacks;
			}else {
				attacks = (attacksPerModel * attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				attacks += (attacker.getRankWidth());
				return attacks;
			}
		}
	}
	
	//this method returns the number needed for the attack to hit the defender
	public int toHit(int attackerWS, int defenderWS) {
		if(attackerWS > defenderWS) {
			return 3;
		}else if(attackerWS < (defenderWS/2)) {
			return 5;
		}else {
			return 4;
		}
	}
	
	//this method returns the number needed to wound the defender
	public int toWound(int attackerS, int defenderT) {
		if(attackerS == defenderT) {
			return 4;
		}else if(attackerS == (defenderT+1)) {
			return 3;
		}else if(attackerS >= (defenderT+2)){
			return 2;
		}else if(attackerS == (defenderT-1)) {
			return 5;
		}else {
			return 6;
		}
	}
	
	//this method returns whether an attack was saved by armor or not
	public boolean doesArmorSave(Unit attacker, Unit defender) {
		Random random = new Random();
		int armorPierce = (attacker.getS()-3);
		if (armorPierce <0) {armorPierce = 0;}
		armorPierce += attacker.getArmorPierce();
		int armorSave = defender.getArmorSave();
		armorSave += armorPierce;
		if (armorSave < 2) {armorSave = 2;}
		int die = random.nextInt(6)+1;
		if(die>=armorSave) {
			return true;
		}else {
			return false;
		}
	}
	
	//this method returns whether an attack was saved by a ward save or not
	public boolean doesWardSave(Unit defender) {
		Random random = new Random();
		int wardSave = defender.getWardSave();
		int die = random.nextInt(6)+1;
		if(defender instanceof DwarfUnit && !(defender instanceof Ironbreakers)) {
			if(!defender.isAttacker() && combatRound == 1 && defender.getWeapon() == Weapon.HandWeaponAndShield) {
				wardSave--;
			}
		}
		if(die>=wardSave) {
			return true;
		}else {
			if(defender instanceof Tzeentch && die==1) {
				die = random.nextInt(6)+1;
				if(die>=wardSave) {
					return true;
				}else {
					return false;
				}
			}else {
				return false;
			}
		}
	}
	
	public void combatResolution(int attackerDealtWounds, int defenderDealtWounds, Unit attacker, Unit defender) {
		Random random = new Random();
		int die = random.nextInt(6)+1;
		int die2 = random.nextInt(6) +1;
		int die3 = random.nextInt(6) +1;
		int modifiedLD;
		//get full ranks beyond the 1st
		int attackerFullRanks = ((attacker.getUnits() / attacker.getRankWidth())-1);
		int defenderFullRanks = ((defender.getUnits() / defender.getRankWidth())-1);
				
		//add rank bonus to combatRes
		if(attackerFullRanks > 3) {attackerFullRanks = 3;}
		int attackerCombatRes = attackerDealtWounds + attackerFullRanks;
		if(defenderFullRanks > 3) {defenderFullRanks = 3;}
		int defenderCombatRes = defenderDealtWounds + defenderFullRanks;
				
				
				
		int combatRes = attackerCombatRes-defenderCombatRes;
		if(combatRes == 0) {
			//tied combat
		}else if(combatRes > 0) {
			//attacker won combat
			if(defender.isFrenzy()) {
				defender.setFrenzy(false);
			}
			
			modifiedLD = defender.getLD();
			if(defender instanceof SkavenUnit) {
				modifiedLD += defenderFullRanks;
			}
			if(defenderFullRanks < attackerFullRanks &&  !defender.getStubborn()) {
				modifiedLD -= combatRes;
			}
			if (modifiedLD < 2) {modifiedLD = 2;}
			if((die+die2)>modifiedLD && !defender.getUnbreakable() && !(defender instanceof LizardUnit)) {
				defender.setLD(0);
				combat=false;
			}
			if(defender instanceof Undead) {
				undeadCrumble(defender, combatRes);
			}
			if(defender instanceof DaemonsUnit) {
				demonicInstability(defender, combatRes, attackerDealtWounds);
			}
			if(defender instanceof LizardUnit) {
				//Cold Blooded
				if(die >= die2 && die >= die3) {
					if((die3+die2)>defender.getLD()) {
						defender.setLD(0);
						combat=false;
					}
				}else if(die2 >= die && die2 >= die3){
					if((die3+die)>defender.getLD()) {
						defender.setLD(0);
						combat=false;
					}
				}else{
					if((die+die2)>defender.getLD()) {
						defender.setLD(0);
						combat=false;
					}
				}
			}
		}else {
			//defender won combat
			if(attacker.isFrenzy()) {
				attacker.setFrenzy(false);
			}
			
			modifiedLD = attacker.getLD();
			if(attacker instanceof SkavenUnit) {
				modifiedLD += attackerFullRanks;
			}
			if(attackerFullRanks < defenderFullRanks && !attacker.getStubborn()) {
				modifiedLD += combatRes;
			}
			if (modifiedLD < 2) {modifiedLD = 2;}
			if((die+die2)>modifiedLD && !attacker.getUnbreakable() && !(attacker instanceof LizardUnit)) {
				attacker.setLD(0);
				combat=false;
			}
			combatRes = combatRes*-1;
			if(attacker instanceof Undead) {
				undeadCrumble(attacker, combatRes);
			}
			if(attacker instanceof DaemonsUnit) {
				demonicInstability(attacker, combatRes, defenderDealtWounds);
			}
			if(attacker instanceof LizardUnit) {
				//Cold Blooded
				if(die >= die2 && die >= die3) {
					if((die3+die2)>attacker.getLD()) {
						attacker.setLD(0);
						combat=false;
					}
				}else if(die2 >= die && die2 >= die3){
					if((die3+die)>attacker.getLD()) {
						attacker.setLD(0);
						combat=false;
					}
				}else{
					if((die+die2)>attacker.getLD()) {
						attacker.setLD(0);
						combat=false;
					}
				}
			}
		}
	}
	
	public int slayerDeathblow(Unit slayer, Unit defender, int slayerAttacks) {
		Random random = new Random();
		int die = random.nextInt(6)+1;
		int toHit = toHit(slayer.getWS(), defender.getWS());
		int negativeAttacks = 0;
		if(slayer.getUnits() < 0) {
			//if slayers were killed to the negatives, they will lose some attacks
			negativeAttacks = slayer.getUnits();
			slayerAttacks += negativeAttacks;
		}
		
		for(int i = slayerAttacks; i > 0; i--) {
			die = random.nextInt(6)+1;
			if(die<toHit) {
				slayerAttacks--;
			}
		}
		//at this point all attacks have hit
		int toWound = toWound(slayer.getS(),defender.getT());
		for(int i = slayerAttacks; i > 0; i--) {
			die = random.nextInt(6)+1;
			if(die<toWound) {
				if(doesArmorSave(slayer,defender)) {
					slayerAttacks--;
				}
			}
		}
		//at this point all attacks have wounded through armor saves
		for(int i = slayerAttacks; i > 0; i--) {
			if(doesWardSave(defender)) {
				slayerAttacks--;
			}
		}
		return slayerAttacks;
	}
	
	public void undeadCrumble(Unit undead, int crumbleDamage) {
		undead.setUnits(undead.getUnits() - crumbleDamage);
	}
	
	public void demonicInstability(Unit daemon, int instability, int deaths) {
		Random random = new Random();
		int die = random.nextInt(6)+1;
		int die2 = random.nextInt(6)+1;
		int modifiedLD = daemon.getLD() - instability;
		if(modifiedLD < 2) {modifiedLD = 2;}
		
		if(die+die2 == 2) {
			daemon.setUnits(daemon.getUnits() + deaths);
		}else if(die+die2==12) {
			daemon.setUnits(0);
			combat = false;
		}else {
			if(die+die2 > modifiedLD) {
				daemon.setUnits(daemon.getUnits() - (die+die2-modifiedLD));
			}
		}
		
	}
	
	public void giftsOfChaos(ChaosUnit warrior) {
		//Currently there is no access to these, but they are here for once they are supported
		if(warrior.isMarkOfKhorne()) {
			warrior.setFrenzy(true);
		}else if(warrior.isMarkOfTzeentch()) {
			warrior.setWardSave(warrior.getWardSave() + 1);
		}else if(warrior.isMarkOfNurgle()) {
			warrior.setToHitMod(warrior.getToHitMod()-1);
		}else if(warrior.isMarkOfSlaanesh()) {
			warrior.setImmuneToPsychology(true);
		}
	}
	
	public void hate(Unit hates, Unit hated) {
		if(hates instanceof DwarfUnit && (hated instanceof SkavenUnit || hated instanceof GreenskinUnit)) {
			hates.setHatred(true);
		}
		if(hates instanceof Khorne && hated instanceof Slaanesh) {
			hates.setHatred(true);
		}
		if (hates instanceof Slaanesh && hated instanceof Khorne) {
			hates.setHatred(true);
		}
		if (hates instanceof Nurgle && hated instanceof Tzeentch) {
			hates.setHatred(true);
		}
		if (hates instanceof Tzeentch && hated instanceof Nurgle) {
			hates.setHatred(true);
		}
		if(hates instanceof DarkElfUnit && hated instanceof HighElfUnit) {
			hates.setHatred(true);
		}
		if(hates instanceof NightGoblins && hated instanceof DwarfUnit) {
			hates.setHatred(true);
		}
	}
}
