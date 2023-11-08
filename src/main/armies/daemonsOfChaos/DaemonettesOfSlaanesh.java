/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.daemonsOfChaos;

import java.util.Arrays;

import main.Weapon;

public class DaemonettesOfSlaanesh extends Slaanesh{
	public DaemonettesOfSlaanesh() {
		this.setName("Daemonettes Of Slaanesh");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(11);
		this.setM(6);
		this.setWS(5);
		this.setBS(4);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(5);
		this.setA(2);
		this.setLD(7);
	}
}
