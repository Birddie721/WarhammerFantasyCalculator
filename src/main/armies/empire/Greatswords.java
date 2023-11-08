/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.empire;

import java.util.Arrays;

import main.Weapon;

public class Greatswords extends EmpireUnit{
	public Greatswords() {
		this.setName("Greatswords");
		this.setWeapons(Arrays.asList(Weapon.GreatWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(11);
		this.setM(4);
		this.setWS(4);
		this.setBS(3);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(3);
		this.setA(1);
		this.setLD(8);
		this.setArmorSave(4);
		this.setStubborn(true);
	}
}
