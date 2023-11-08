/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.chaosDwarfs;

import java.util.Arrays;

import main.Weapon;

public class ChaosDwarfInfernalIronsworn extends ChaosDwarfUnit{
	public ChaosDwarfInfernalIronsworn() {
		this.setName("Chaos Dwarf Infernal Ironsworn");
		this.setWeapons(Arrays.asList(Weapon.HandWeaponAndShield));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(17);
		this.setM(3);
		this.setWS(5);
		this.setBS(3);
		this.setS(5);
		this.setT(4);
		this.setW(1);
		this.setI(2);
		this.setA(1);
		this.setLD(9);
		this.setArmorSave(4);
	}
}
