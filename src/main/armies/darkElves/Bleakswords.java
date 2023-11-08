/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.darkElves;

import java.util.Arrays;

import main.Weapon;

public class Bleakswords extends DarkElfUnit{
	public Bleakswords() {
		this.setName("Bleakswords");
		this.setWeapons(Arrays.asList(Weapon.HandWeaponAndShield));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(9);
		this.setM(5);
		this.setWS(4);
		this.setBS(4);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(5);
		this.setA(1);
		this.setLD(8);
		setArmorSave(6);
	}
}
