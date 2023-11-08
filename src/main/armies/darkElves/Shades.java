/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.darkElves;

import java.util.Arrays;

import main.Weapon;

public class Shades extends DarkElfUnit{
	public Shades() {
		this.setName("Shades");
		this.setWeapons(Arrays.asList(Weapon.SpearAndShield, Weapon.AdditionalHandWeapons, Weapon.GreatWeapon));
		int[] costs = new int[3];
		costs[0]=0;
		costs[1]=2;
		costs[2]=2;
		this.setWeaponCosts(costs);
		this.setPoints(16);
		this.setM(5);
		this.setWS(5);
		this.setBS(5);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(5);
		this.setA(1);
		this.setLD(8);
	}
}
