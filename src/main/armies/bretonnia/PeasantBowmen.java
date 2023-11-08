/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.bretonnia;

import java.util.Arrays;

import main.Weapon;

public class PeasantBowmen extends BretonnianUnit{
	public PeasantBowmen() {
		this.setName("Peasant Bowmen");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(5);
		this.setM(4);
		this.setWS(2);
		this.setBS(3);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(3);
		this.setA(1);
		this.setLD(5);
	}
}
