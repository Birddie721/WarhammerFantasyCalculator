/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.vampireCounts;

import java.util.Arrays;

import main.Weapon;

public class GraveGuard extends VampireCountsUnit{
	public GraveGuard() {
		this.setName("Grave Guard");
		this.setWeapons(Arrays.asList(Weapon.HandWeaponAndShield, Weapon.GreatWeapon));
		int[] costs = new int[2];
		costs[0]=0;
		costs[1]=1;
		this.setWeaponCosts(costs);
		this.setPoints(11);
		this.setM(4);
		this.setWS(3);
		this.setBS(0);
		this.setS(4);
		this.setT(4);
		this.setW(1);
		this.setI(3);
		this.setA(1);
		this.setLD(6);
		this.setKillingBlow(true);
		this.setArmorSave(5);
	}
}
