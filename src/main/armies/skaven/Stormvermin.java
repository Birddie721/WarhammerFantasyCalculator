/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.skaven;

import java.util.Arrays;

import main.Weapon;

public class Stormvermin extends SkavenUnit{
	public Stormvermin() {
		this.setName("Stormvermin");
		this.setWeapons(Arrays.asList(Weapon.Halberd, Weapon.HandWeapon, Weapon.HandWeaponAndShield));
		int[] costs = new int[3];
		costs[0]=0;
		costs[1]=0;
		costs[2]=1;
		this.setWeaponCosts(costs);
		this.setPoints(7);
		this.setM(5);
		this.setWS(4);
		this.setBS(3);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(5);
		this.setA(1);
		this.setLD(5);
		this.setArmorSave(5);
	}
}
