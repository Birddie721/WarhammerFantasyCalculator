/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.darkElves;

import java.util.Arrays;

import main.Weapon;

public class BlackGuardOfNaggarond extends DarkElfUnit{
	public BlackGuardOfNaggarond() {
		this.setName("Black Guard of Naggarond");
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
		this.setA(2);
		this.setLD(9);
		setArmorSave(5);
		this.setImmuneToPsychology(true);
		this.setStubborn(true);
	}
}
