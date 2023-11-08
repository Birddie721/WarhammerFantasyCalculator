/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.dwarfs;

import java.util.Arrays;

import main.Weapon;

public class Hammerers extends DwarfUnit{
	public Hammerers() {
		this.setName("Hammerers");
		this.setWeapons(Arrays.asList(Weapon.GreatWeapon, Weapon.HandWeaponAndShield, Weapon.HandWeapon));
		int[] costs = new int[3];
		costs[0]=0;
		costs[1]=1;
		costs[2]=0;
		this.setWeaponCosts(costs);
		this.setPoints(14);
		this.setM(3);
		this.setWS(5);
		this.setBS(3);
		this.setS(4);
		this.setT(4);
		this.setW(1);
		this.setI(2);
		this.setA(2);
		this.setLD(9);
		this.setArmorSave(5);
		this.setStubborn(true);
	}
}
