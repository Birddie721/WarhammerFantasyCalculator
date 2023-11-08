/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.woodElves;

import java.util.Arrays;

import main.Weapon;

public class EternalGuard extends WoodElfUnit{
	public EternalGuard() {
		this.setName("Eternal Guard");
		this.setWeapons(Arrays.asList(Weapon.Spear, Weapon.SpearAndShield, Weapon.HandWeapon, Weapon.HandWeaponAndShield));
		int[] costs = new int[4];
		costs[0]=0;
		costs[1]=1;
		costs[2]=0;
		costs[3]=1;
		this.setWeaponCosts(costs);
		this.setPoints(11);
		this.setM(5);
		this.setWS(5);
		this.setBS(4);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(5);
		this.setA(1);
		this.setLD(9);
		this.setArmorSave(6);
		this.setStubborn(true);
	}
}
