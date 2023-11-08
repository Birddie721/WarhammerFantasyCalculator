/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.skaven;

import java.util.Arrays;

import main.Weapon;

public class NightRunners extends SkavenUnit{
	public NightRunners() {
		this.setName("Night Runners");
		this.setWeapons(Arrays.asList(Weapon.AdditionalHandWeapons));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(7);
		this.setM(5);
		this.setWS(3);
		this.setBS(3);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(5);
		this.setA(1);
		this.setLD(6);
	}
}
