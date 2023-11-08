/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.empire;

import java.util.Arrays;

import main.Weapon;

public class Spearmen extends EmpireUnit{
	public Spearmen() {
		this.setName("Spearmen");
		this.setWeapons(Arrays.asList(Weapon.Spear, Weapon.SpearAndShield));
		int[] costs = new int[2];
		costs[0]=0;
		costs[1]=1;
		this.setWeaponCosts(costs);
		this.setPoints(5);
		this.setM(4);
		this.setWS(3);
		this.setBS(3);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(3);
		this.setA(1);
		this.setLD(7);
		this.setArmorSave(6);
	}
}
