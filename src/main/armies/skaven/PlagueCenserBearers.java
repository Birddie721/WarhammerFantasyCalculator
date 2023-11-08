/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.skaven;

import java.util.Arrays;

import main.Weapon;

public class PlagueCenserBearers extends SkavenUnit{
	public PlagueCenserBearers() {
		this.setName("Plague Censer Bearers");
		this.setWeapons(Arrays.asList(Weapon.Flail));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(16);
		this.setM(5);
		this.setWS(3);
		this.setBS(3);
		this.setS(3);
		this.setT(4);
		this.setW(1);
		this.setI(3);
		this.setA(2);
		this.setLD(5);
		this.setFrenzy(true);
		this.setHatred(true);
	}
}
