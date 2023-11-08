/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.tombKings;

import main.Unit;

public class Undead extends Unit{
	public Undead() {
		this.setCausesFear(true);
		this.setUnbreakable(true);
	}
}
