/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.highElves;

import java.util.Arrays;

import main.Weapon;

public class SwordmastersOfHoeth extends HighElfUnit{
	public SwordmastersOfHoeth() {
		this.setName("Swordmasters of Hoeth");
		this.setWeapons(Arrays.asList(Weapon.GreatWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(13);
		this.setM(5);
		this.setWS(6);
		this.setBS(4);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(5);
		this.setA(2);
		this.setLD(8);
		setArmorSave(5);
	}
}
