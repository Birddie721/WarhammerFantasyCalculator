/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.daemonsOfChaos;

import java.util.Arrays;

import main.Weapon;

public class PlaguebearersOfNurgle extends Nurgle{
	public PlaguebearersOfNurgle() {
		this.setName("Plaguebearers Of Nurgle");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(13);
		this.setM(4);
		this.setWS(3);
		this.setBS(3);
		this.setS(4);
		this.setT(4);
		this.setW(1);
		this.setI(2);
		this.setA(1);
		this.setLD(7);
		this.setPoisonedAttacks(true);
	}
}
