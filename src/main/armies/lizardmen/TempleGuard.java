/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.lizardmen;

import java.util.Arrays;

import main.Weapon;

public class TempleGuard extends PredatoryFighterUnit{
	public TempleGuard() {
		this.setName("Temple Guard");
		this.setWeapons(Arrays.asList(Weapon.Halberd));
		int[] costs = new int[1];
		costs[0]=0;
		this.setWeaponCosts(costs);
		this.setPoints(14);
		this.setM(4);
		this.setWS(4);
		this.setBS(0);
		this.setS(4);
		this.setT(4);
		this.setW(1);
		this.setI(2);
		this.setA(2);
		this.setLD(8);
		setArmorSave(4);
	}
}
