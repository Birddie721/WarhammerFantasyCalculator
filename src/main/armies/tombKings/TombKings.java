/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.tombKings;

import java.util.Arrays;

import main.armies.Army;

public class TombKings extends Army{
	public TombKings() {
		this.setName("Tomb Kings");
		this.setUnits(Arrays.asList(new SkeletonWarriors(), new SkeletonArchers(), new TombGuard()));
	}

	
}
