/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.orcsAndGoblins;

import java.util.Arrays;

import main.Weapon;

public class BlackOrcs extends OrcUnit{
	public BlackOrcs() {
		this.setName("Black Orcs");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon, Weapon.AdditionalHandWeapons, Weapon.GreatWeapon, Weapon.HandWeaponAndShield));
		int[] costs = new int[4];
		costs[0]=0;
		costs[1]=0;
		costs[2]=0;
		costs[3]=1;
		this.setWeaponCosts(costs);
		this.setPoints(12);
		this.setM(4);
		this.setWS(4);
		this.setBS(3);
		this.setS(4);
		this.setT(4);
		this.setW(1);
		this.setI(2);
		this.setA(1);
		this.setLD(8);
		this.setArmorSave(5);
		this.setImmuneToPsychology(true);
	}
}
