/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.vampireCounts;

import java.util.Arrays;

import main.Weapon;

public class Zombies extends VampireCountsUnit{
	public Zombies() {
		this.setName("Zombies");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(3);
		this.setM(4);
		this.setWS(1);
		this.setBS(0);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(1);
		this.setA(1);
		this.setLD(2);
		this.setAlwaysStrikesLast(true);
	}
}
