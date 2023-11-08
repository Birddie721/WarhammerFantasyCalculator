/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.beastmen;

import java.util.Arrays;

import main.Weapon;

public class BestigorHerd extends BeastmanUnit{
	public BestigorHerd() {
		this.setName("Bestigor Herd");
		this.setWeapons(Arrays.asList(Weapon.GreatWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(12);
		this.setM(5);
		this.setWS(4);
		this.setBS(3);
		this.setS(4);
		this.setT(4);
		this.setW(1);
		this.setI(3);
		this.setA(1);
		this.setLD(7);
		this.setArmorSave(5);
	}
}
