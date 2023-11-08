/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.lizardmen;

import java.util.Arrays;

import main.armies.Army;

public class Lizardmen extends Army{
	public Lizardmen() {
		this.setName("Lizardmen");
		this.setUnits(Arrays.asList(new SaurusWarriors(), new SkinkCohort(), new TempleGuard(), new ChameleonSkinks()));
	}

}
