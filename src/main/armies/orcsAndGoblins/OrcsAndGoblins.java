/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.orcsAndGoblins;

import java.util.Arrays;

import main.armies.Army;

public class OrcsAndGoblins extends Army{
	public OrcsAndGoblins() {
		this.setName("Orcs & Goblins");
		this.setUnits(Arrays.asList(new OrcBoyz(), new OrcBigUns(), new OrcArrerBoyz(), new SavageOrcs(), new SavageOrcBigUns(), new Goblins(), new NightGoblins(), new BlackOrcs()));
	}

}
