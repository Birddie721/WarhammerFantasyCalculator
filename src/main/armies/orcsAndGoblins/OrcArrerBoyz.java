/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.orcsAndGoblins;

import java.util.Arrays;

import main.Weapon;

public class OrcArrerBoyz extends OrcUnit{
	public OrcArrerBoyz() {
		this.setName("Orc Arrer Boyz");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(7);
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
