/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.highElves;

import java.util.Arrays;

import main.armies.Army;

public class HighElves extends Army{
	
	public HighElves() {
		this.setName("High Elves");
		this.setUnits(Arrays.asList(new Spearmen(), new Archers(), new LothernSeaGuard(), new WhiteLionsOfChrace(), new SwordmastersOfHoeth(), new ShadowWarriors(), new PhoenixGuard(), new SistersOfAvelorn()));
	}


}
