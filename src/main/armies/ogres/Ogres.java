/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.ogres;

import java.util.Arrays;

import main.armies.Army;

public class Ogres extends Army{
	public Ogres() {
		this.setName("Ogres");
		this.setUnits(Arrays.asList(new Gnoblars()));
	}

}
