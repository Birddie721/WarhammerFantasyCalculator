/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.beastmen;

import java.util.Arrays;

import main.armies.Army;

public class Beastmen extends Army{
	public Beastmen() {
		this.setName("Beastmen");
		this.setUnits(Arrays.asList(new GorHerd(), new UngorHerd(), new Harpies(), new BestigorHerd()));
	}

}
