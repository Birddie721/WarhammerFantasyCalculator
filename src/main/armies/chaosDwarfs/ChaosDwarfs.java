/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.chaosDwarfs;

import java.util.Arrays;

import main.armies.Army;

public class ChaosDwarfs extends Army{
	public ChaosDwarfs() {
		this.setName("Chaos Dwarfs");
		this.setUnits(Arrays.asList(new ChaosDwarfInfernalGuard(), new HobgoblinCutthroats(), new ChaosDwarfInfernalIronsworn()));
	}

}
