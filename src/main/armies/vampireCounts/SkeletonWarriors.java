/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.vampireCounts;

import java.util.Arrays;

import main.Weapon;

public class SkeletonWarriors extends VampireCountsUnit{
	public SkeletonWarriors() {
		this.setName("Skeleton Warriors");
		this.setWeapons(Arrays.asList(Weapon.HandWeaponAndShield, Weapon.Spear, Weapon.SpearAndShield));
		int[] costs = new int[3];
		costs[0]=0;
		costs[1]=0;
		costs[2]=0;
		this.setWeaponCosts(costs);
		this.setPoints(5);
		this.setM(4);
		this.setWS(2);
		this.setBS(2);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(2);
		this.setA(1);
		this.setLD(3);
		this.setArmorSave(6);
	}
}
