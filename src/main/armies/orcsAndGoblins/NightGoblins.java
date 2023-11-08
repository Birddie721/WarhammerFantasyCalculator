/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.orcsAndGoblins;

import java.util.Arrays;

import main.Weapon;

public class NightGoblins extends GoblinUnit{
	public NightGoblins() {
		this.setName("Night Goblins");
		this.setWeapons(Arrays.asList(Weapon.HandWeaponAndShield,Weapon.SpearAndShield));
		int[] costs = new int[4];
		costs[0]=0;
		costs[1]=0;
		this.setWeaponCosts(costs);
		this.setPoints(3);
		this.setM(4);
		this.setWS(2);
		this.setBS(3);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(3);
		this.setA(1);
		this.setLD(5);
	}
}
