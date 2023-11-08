/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.bretonnia;

import java.util.Arrays;

import main.Weapon;

public class MenAtArms extends BretonnianUnit{
	public MenAtArms() {
		this.setName("Men-at-Arms");
		this.setWeapons(Arrays.asList(Weapon.Halberd, Weapon.HandWeaponAndShield, Weapon.HandWeapon, Weapon.Spear, Weapon.SpearAndShield));
		int[] costs = new int[5];
		costs[0]=0;
		costs[1]=0;
		costs[2]=0;
		costs[3]=0;
		costs[4]=0;
		this.setWeaponCosts(costs);
		this.setPoints(5);
		this.setM(4);
		this.setWS(2);
		this.setBS(2);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(3);
		this.setA(1);
		this.setLD(5);
		this.setArmorSave(6);
	}
}
