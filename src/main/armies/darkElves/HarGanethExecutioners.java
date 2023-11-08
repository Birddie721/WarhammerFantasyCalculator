/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.darkElves;

import java.util.Arrays;

import main.Weapon;

public class HarGanethExecutioners extends DarkElfUnit{
	public HarGanethExecutioners() {
		this.setName("Har Ganeth Executioners");
		this.setWeapons(Arrays.asList(Weapon.GreatWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(12);
		this.setM(5);
		this.setWS(5);
		this.setBS(4);
		this.setS(4);
		this.setT(3);
		this.setW(1);
		this.setI(5);
		this.setA(1);
		this.setLD(9);
		setArmorSave(5);
		this.setKillingBlow(true);
	}
}
