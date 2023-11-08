/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.darkElves;

import java.util.Arrays;

import main.Weapon;

public class WitchElves extends DarkElfUnit{
	public WitchElves() {
		this.setName("Witch Elves");
		this.setWeapons(Arrays.asList(Weapon.AdditionalHandWeapons));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(11);
		this.setM(5);
		this.setWS(4);
		this.setBS(4);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(6);
		this.setA(1);
		this.setLD(8);
		this.setPoisonedAttacks(true);
		this.setFrenzy(true);
	}
}
