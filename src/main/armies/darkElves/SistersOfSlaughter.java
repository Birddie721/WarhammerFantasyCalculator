/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.darkElves;

import java.util.Arrays;

import main.Weapon;

public class SistersOfSlaughter extends DarkElfUnit{
	public SistersOfSlaughter() {
		this.setName("Sisters Of Slaughter");
		this.setWeapons(Arrays.asList(Weapon.HandWeaponAndShield));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(15);
		this.setM(5);
		this.setWS(6);
		this.setBS(4);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(6);
		this.setA(2);
		this.setLD(9);
		this.setWardSave(4);
	}
}
