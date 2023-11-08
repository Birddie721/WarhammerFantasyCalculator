/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.empire;

import java.util.Arrays;

import main.armies.Army;

public class Empire extends Army{
	public Empire() {
		this.setName("Empire");
		this.setUnits(Arrays.asList(new Halberdiers(), new Spearmen(), new Swordsmen(), new Crossbowmen(), new Handgunners(), new Archers(), new FreeCompanyMilitia(), new Greatswords(), new Huntsmen(), new Flagellants()));
	}

}
