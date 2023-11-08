/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.vampireCounts;

import java.util.Arrays;

import main.Weapon;
//Currently unsupported due to ethereal and 2 wounds each
public class CarinWraiths extends VampireCountsUnit{
	public CarinWraiths() {
		this.setName("Carin Wraiths");
		this.setWeapons(Arrays.asList(Weapon.GreatWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(50);
		this.setM(6);
		this.setWS(3);
		this.setBS(0);
		this.setS(3);
		this.setT(3);
		this.setW(2);
		this.setI(2);
		this.setA(3);
		this.setLD(5);
	}
}
