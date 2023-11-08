/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.tombKings;

import java.util.Arrays;

import main.Weapon;

public class SkeletonWarriors extends TombKingsUnit{
	public SkeletonWarriors() {
		this.setName("Skeleton Warriors");
		this.setWeapons(Arrays.asList(Weapon.HandWeaponAndShield, Weapon.SpearAndShield));
		int[] costs = new int[2];
		costs[0]=0;
		costs[1]=1;
		this.setWeaponCosts(costs);
		this.setPoints(4);
		this.setM(4);
		this.setWS(2);
		this.setBS(2);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(2);
		this.setA(1);
		this.setLD(5);
	}
}
