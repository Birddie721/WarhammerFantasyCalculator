/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.warriorsOfChaos;

import java.util.Arrays;

import main.armies.Army;

public class WarriorsOfChaos extends Army{
	public WarriorsOfChaos() {
		this.setName("Warriors Of Chaos");
		this.setUnits(Arrays.asList(new ChaosWarriors(), new ChaosMarauders(), new Forsaken(), new Chosen()));
	}
	
	
}
