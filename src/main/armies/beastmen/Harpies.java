/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.beastmen;

import java.util.Arrays;

import main.Unit;
import main.Weapon;

public class Harpies extends Unit{
	public Harpies() {
		this.setName("Harpies");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(11);
		this.setM(5);
		this.setWS(3);
		this.setBS(0);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(5);
		this.setA(2);
		this.setLD(6);
	}
}
