/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.lizardmen;

import java.util.Arrays;

import main.Weapon;

public class ChameleonSkinks extends LizardUnit{
	public ChameleonSkinks() {
		this.setName("Chameleon Skinks");
		this.setWeapons(Arrays.asList(Weapon.HandWeapon));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(13);
		this.setM(6);
		this.setWS(2);
		this.setBS(4);
		this.setS(3);
		this.setT(2);
		this.setW(1);
		this.setI(4);
		this.setA(1);
		this.setLD(5);
		setArmorSave(6);
	}
}
