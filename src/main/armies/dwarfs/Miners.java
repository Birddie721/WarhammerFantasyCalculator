/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.dwarfs;

import java.util.Arrays;

import main.Weapon;

public class Miners extends DwarfUnit{
	public Miners() {
		this.setName("Miners");
		this.setWeapons(Arrays.asList(Weapon.GreatWeapon, Weapon.HandWeapon));
		int[] costs = new int[2];
		costs[0]=0;
		costs[1]=0;
		this.setWeaponCosts(costs);
		this.setPoints(10);
		this.setM(3);
		this.setWS(4);
		this.setBS(3);
		this.setS(3);
		this.setT(4);
		this.setW(1);
		this.setI(2);
		this.setA(1);
		this.setLD(9);
		this.setArmorSave(5);
	}

}
