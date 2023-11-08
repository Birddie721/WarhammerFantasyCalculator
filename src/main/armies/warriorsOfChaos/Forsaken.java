/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.warriorsOfChaos;

import java.util.Arrays;

import main.Weapon;

public class Forsaken extends ChaosUnit{
	public Forsaken() {
		this.setName("Forsaken");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(19);
		this.setM(6);
		this.setWS(4);
		this.setBS(0);
		this.setS(4);
		this.setT(4);
		this.setW(1);
		this.setI(4);
		this.setA(2);
		this.setLD(8);
		this.setArmorSave(4);
		this.setFrenzy(true);
		this.setImmuneToPsychology(true);
	}
}
