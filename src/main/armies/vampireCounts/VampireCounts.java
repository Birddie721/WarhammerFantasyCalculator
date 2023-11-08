/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.vampireCounts;

import java.util.Arrays;

import main.armies.Army;

public class VampireCounts extends Army{
	public VampireCounts() {
		this.setName("Vampire Counts");
		this.setUnits(Arrays.asList(new Zombies(), new SkeletonWarriors(), new CryptGhouls(), new GraveGuard()));
	}

}
