/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.highElves;

import java.util.Arrays;

import main.Weapon;

public class PhoenixGuard extends HighElfUnit{
	public PhoenixGuard() {
		this.setName("Phoenix Guard");
		this.setWeapons(Arrays.asList(Weapon.Halberd));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(15);
		this.setM(5);
		this.setWS(5);
		this.setBS(4);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(6);
		this.setA(1);
		this.setLD(9);
		setArmorSave(5);
		setWardSave(4);
		setCausesFear(true);
	}
}
