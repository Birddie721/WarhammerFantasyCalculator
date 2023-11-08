/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.vampireCounts;

import java.util.Arrays;

import main.Weapon;

public class CryptGhouls extends VampireCountsUnit{
	public CryptGhouls() {
		this.setName("Crypt Ghouls");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(10);
		this.setM(4);
		this.setWS(3);
		this.setBS(0);
		this.setS(3);
		this.setT(4);
		this.setW(1);
		this.setI(3);
		this.setA(2);
		this.setLD(5);
		this.setPoisonedAttacks(true);
	}
}
