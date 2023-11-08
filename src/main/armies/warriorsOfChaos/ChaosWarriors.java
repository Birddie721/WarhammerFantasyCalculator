/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.warriorsOfChaos;

import java.util.Arrays;

import main.Weapon;

public class ChaosWarriors extends ChaosUnit{
	public ChaosWarriors() {
		this.setName("Chaos Warriors");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon, Weapon.HandWeaponAndShield, Weapon.AdditionalHandWeapons, Weapon.GreatWeapon, Weapon.Halberd));
		int[] costs = new int[5];
		costs[0]=0;
		costs[1]=1;
		costs[2]=2;
		costs[3]=3;
		costs[4]=3;
		this.setWeaponCosts(costs);
		this.setPoints(14);
		this.setM(4);
		this.setWS(5);
		this.setBS(3);
		this.setS(4);
		this.setT(4);
		this.setW(1);
		this.setI(5);
		this.setA(2);
		this.setLD(8);
		this.setArmorSave(4);
	}
}
