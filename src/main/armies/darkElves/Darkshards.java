/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.darkElves;

import java.util.Arrays;

import main.Weapon;

public class Darkshards extends DarkElfUnit{
	public Darkshards() {
		this.setName("Darkshards");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon, Weapon.HandWeaponAndShield));
		int[] costs = new int[2];
		costs[0]=0;
		costs[1]=1;
		this.setWeaponCosts(costs);
		this.setPoints(12);
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
