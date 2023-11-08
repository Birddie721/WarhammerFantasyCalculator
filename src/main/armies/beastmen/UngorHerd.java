/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.beastmen;

import java.util.Arrays;

import main.Weapon;

public class UngorHerd extends BeastmanUnit{
	public UngorHerd() {
		this.setName("Ungor Herd");
		this.setWeapons(Arrays.asList(Weapon.HandWeaponAndShield, Weapon.Spear));
		int[] costs = new int[2];
		costs[0]=0;
		costs[1]=1;
		this.setWeaponCosts(costs);
		this.setPoints(5);
		this.setM(5);
		this.setWS(3);
		this.setBS(3);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(3);
		this.setA(1);
		this.setLD(6);
	}
}
