/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.daemonsOfChaos;

import main.Unit;

public class DaemonsUnit extends Unit{
	public DaemonsUnit() {
		this.setCausesFear(true);
		this.setWardSave(5);
		this.setUnbreakable(true);
	}
}
