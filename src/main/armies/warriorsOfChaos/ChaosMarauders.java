/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.warriorsOfChaos;

import java.util.Arrays;

import main.Weapon;

public class ChaosMarauders extends ChaosUnit{
	public ChaosMarauders() {
		this.setName("Chaos Marauders");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon, Weapon.HandWeaponAndShield, Weapon.GreatWeapon, Weapon.Flail));
		int[] costs = new int[4];
		costs[0]=0;
		costs[1]=1;
		costs[2]=3;
		costs[3]=2;
		this.setWeaponCosts(costs);
		this.setPoints(6);
		this.setM(4);
		this.setWS(4);
		this.setBS(3);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(4);
		this.setA(1);
		this.setLD(7);
	}
}
