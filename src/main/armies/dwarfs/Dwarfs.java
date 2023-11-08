/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.dwarfs;

import java.util.Arrays;
import main.armies.Army;

public class Dwarfs extends Army{
	public Dwarfs() {
		this.setName("Dwarfs");
		this.setUnits(Arrays.asList(new Warriors(), new Quarrelers(), new Thunderers(), new Longbeards(), new Hammerers(), new Ironbreakers(), new Miners(), new Slayers(), new Rangers(), new Irondrakes()));
	}

	
}
