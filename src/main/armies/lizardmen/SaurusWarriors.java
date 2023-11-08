/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.lizardmen;

import java.util.Arrays;

import main.Weapon;

public class SaurusWarriors extends PredatoryFighterUnit{
	public SaurusWarriors() {
		this.setName("Saurus Warriors");
		this.setWeapons(Arrays.asList(Weapon.HandWeaponAndShield, Weapon.SpearAndShield));
		int[] costs = new int[2];
		costs[0]=0;
		costs[1]=0;
		this.setWeaponCosts(costs);
		this.setPoints(11);
		this.setM(4);
		this.setWS(3);
		this.setBS(0);
		this.setS(4);
		this.setT(4);
		this.setW(1);
		this.setI(1);
		this.setA(2);
		this.setLD(8);
		setArmorSave(5);
	}
}
