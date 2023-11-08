/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.orcsAndGoblins;

import java.util.Arrays;

import main.Weapon;

public class OrcBoyz extends OrcUnit{
	public OrcBoyz() {
		this.setName("Orc Boyz");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon, Weapon.HandWeaponAndShield, Weapon.Spear, Weapon.SpearAndShield, Weapon.AdditionalHandWeapons));
		int[] costs = new int[5];
		costs[0]=0;
		costs[1]=1;
		costs[2]=1;
		costs[3]=2;
		costs[4]=1;
		this.setWeaponCosts(costs);
		this.setPoints(6);
		this.setM(4);
		this.setWS(3);
		this.setBS(3);
		this.setS(3);
		this.setT(4);
		this.setW(1);
		this.setI(2);
		this.setA(1);
		this.setLD(7);
		this.setArmorSave(6);
	}
}
