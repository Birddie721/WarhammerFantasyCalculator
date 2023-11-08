/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.skaven;

import java.util.Arrays;

import main.Weapon;

public class Clanrats extends SkavenUnit{
	public Clanrats() {
		this.setName("Clanrats");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon, Weapon.HandWeaponAndShield, Weapon.Spear, Weapon.SpearAndShield));
		int[] costs = new int[4];
		costs[0]=0;
		costs[1]=1;
		costs[2]=1;
		costs[3]=1;
		this.setWeaponCosts(costs);
		this.setPoints(4);
		this.setM(5);
		this.setWS(3);
		this.setBS(3);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(4);
		this.setA(1);
		this.setLD(5);
		this.setArmorSave(6);
	}
}
