/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.woodElves;

import java.util.Arrays;

import main.armies.Army;

public class WoodElves extends Army{
	public WoodElves() {
		this.setName("Wood Elves");
		this.setUnits(Arrays.asList(new GladeGuard(), new Dryads(), new EternalGuard(), new WildwoodRangers(), new Wardancers(), new DeepwoodScouts(), new Waywatchers()));
	}

}
