/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.woodElves;

import java.util.Arrays;

import main.Weapon;

public class Wardancers extends WoodElfUnit{
	public Wardancers() {
		this.setName("Wardancers");
		this.setWeapons(Arrays.asList(Weapon.AdditionalHandWeapons, Weapon.Spear));
		int[] costs = new int[2];
		costs[0]=0;
		costs[1]=1;
		this.setWeaponCosts(costs);
		this.setPoints(15);
		this.setM(5);
		this.setWS(6);
		this.setBS(4);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(6);
		this.setA(1);
		this.setLD(8);
		this.setImmuneToPsychology(true);
		this.setWardSave(6);
	}
}
