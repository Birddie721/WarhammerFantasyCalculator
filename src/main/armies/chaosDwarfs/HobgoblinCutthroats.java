/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.chaosDwarfs;

import java.util.Arrays;

import main.Unit;
import main.Weapon;

public class HobgoblinCutthroats extends Unit{
	public HobgoblinCutthroats() {
		this.setName("Chaos Dwarf Infernal Guard");
		this.setWeapons(Arrays.asList(Weapon.HandWeaponAndShield, Weapon.HandWeaponAndShield, Weapon.AdditionalHandWeapons));
		int[] costs = new int[3];
		costs[0]=0;
		costs[1]=1;
		costs[2]=1;
		this.setWeaponCosts(costs);
		this.setPoints(4);
		this.setM(4);
		this.setWS(3);
		this.setBS(3);
		this.setS(3);
		this.setT(3);
		this.setW(1);
		this.setI(2);
		this.setA(1);
		this.setLD(6);
		this.setArmorSave(6);
	}
}
