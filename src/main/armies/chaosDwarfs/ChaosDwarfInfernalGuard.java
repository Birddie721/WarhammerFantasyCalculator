/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.chaosDwarfs;

import java.util.Arrays;

import main.Weapon;

public class ChaosDwarfInfernalGuard extends ChaosDwarfUnit{
	public ChaosDwarfInfernalGuard() {
		this.setName("Chaos Dwarf Infernal Guard");
		this.setWeapons(Arrays.asList(Weapon.HandWeaponAndShield, Weapon.GreatWeapon, Weapon.Halberd));
		int[] costs = new int[3];
		costs[0]=0;
		costs[1]=3;
		costs[2]=5;
		this.setWeaponCosts(costs);
		this.setPoints(12);
		this.setM(3);
		this.setWS(4);
		this.setBS(3);
		this.setS(4);
		this.setT(4);
		this.setW(1);
		this.setI(2);
		this.setA(1);
		this.setLD(9);
		this.setArmorSave(4);
	}
}
