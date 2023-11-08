/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.daemonsOfChaos;

import java.util.Arrays;

import main.Weapon;

public class BloodlettersOfKhorne extends Khorne{
	public BloodlettersOfKhorne() {
		this.setName("Bloodletters Of Khorne");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(14);
		this.setM(5);
		this.setWS(5);
		this.setBS(5);
		this.setS(4);
		this.setT(3);
		this.setW(1);
		this.setI(4);
		this.setA(1);
		this.setLD(7);
		this.setArmorSave(6);
		this.setKillingBlow(true);
	}
}
