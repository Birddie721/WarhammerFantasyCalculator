/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.bretonnia;

import java.util.Arrays;

import main.armies.Army;

public class Bretonnia extends Army{
	public Bretonnia() {
		this.setName("Bretonnia");
		this.setUnits(Arrays.asList(new MenAtArms(), new PeasantBowmen()));
	}

}
