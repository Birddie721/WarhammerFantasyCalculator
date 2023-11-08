/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.skaven;

import java.util.Arrays;

import main.armies.Army;

public class Skaven extends Army{
	public Skaven() {
		this.setName("Skaven");
		this.setUnits(Arrays.asList(new Clanrats(), new Stormvermin(), new Skavenslaves(), new NightRunners(), new GutterRunners(), new PlagueMonks(), new PlagueCenserBearers()));
	}
	
}
