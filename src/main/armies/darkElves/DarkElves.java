/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.darkElves;

import java.util.Arrays;

import main.armies.Army;

public class DarkElves extends Army{
	public DarkElves() {
		this.setName("Dark Elves");
		this.setUnits(Arrays.asList(new Dreadspears(), new Bleakswords(), new Darkshards(), new BlackArkCorsairs(), new WitchElves(), new BlackGuardOfNaggarond(), new Shades(), new HarGanethExecutioners(), new Harpies(), new SistersOfSlaughter()));
	}

}
