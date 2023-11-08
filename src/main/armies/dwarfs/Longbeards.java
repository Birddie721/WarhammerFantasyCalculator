/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.dwarfs;

import java.util.Arrays;

import main.Weapon;

public class Longbeards extends DwarfUnit{
	public Longbeards() {
		this.setName("Longbeards");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon, Weapon.HandWeaponAndShield, Weapon.GreatWeapon));
		int[] costs = new int[3];
		costs[0]=0;
		costs[1]=1;
		costs[2]=2;
		this.setWeaponCosts(costs);
		this.setPoints(12);
		this.setM(3);
		this.setWS(5);
		this.setBS(3);
		this.setS(4);
		this.setT(4);
		this.setW(1);
		this.setI(2);
		this.setA(1);
		this.setLD(9);
		this.setArmorSave(5);
	}

}
