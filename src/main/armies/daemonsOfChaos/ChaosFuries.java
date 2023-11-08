/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.daemonsOfChaos;

import java.util.Arrays;

import main.Weapon;

public class ChaosFuries extends DaemonsUnit{
	public ChaosFuries() {
		this.setName("Chaos Furies");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(12);
		this.setM(4);
		this.setWS(3);
		this.setBS(0);
		this.setS(4);
		this.setT(3);
		this.setW(1);
		this.setI(4);
		this.setA(1);
		this.setLD(2);
		this.setWardSave(5);
		this.setCausesFear(true);
	}
}
