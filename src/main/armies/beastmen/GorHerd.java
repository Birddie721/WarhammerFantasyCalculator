/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.beastmen;

import java.util.Arrays;

import main.Weapon;

public class GorHerd extends BeastmanUnit{
	public GorHerd() {
		this.setName("Gor Herd");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon, Weapon.HandWeaponAndShield, Weapon.AdditionalHandWeapons));
		int[] costs = new int[3];
		costs[0]=0;
		costs[1]=1;
		costs[2]=1;
		this.setWeaponCosts(costs);
		this.setPoints(7);
		this.setM(5);
		this.setWS(4);
		this.setBS(3);
		this.setS(3);
		this.setT(4);
		this.setW(1);
		this.setI(3);
		this.setA(1);
		this.setLD(7);
	}
}
