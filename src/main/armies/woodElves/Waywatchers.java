/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.woodElves;

import java.util.Arrays;

import main.Weapon;

public class Waywatchers extends WoodElfUnit{
	public Waywatchers() {
		this.setName("Waywatchers");
		this.setWeapons(Arrays.asList(Weapon.AdditionalHandWeapons));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(20);
		this.setM(5);
		this.setWS(4);
		this.setBS(5);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(5);
		this.setA(1);
		this.setLD(8);
	}
}
