/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.daemonsOfChaos;

import java.util.Arrays;

import main.armies.Army;

public class ChaosDaemons extends Army{
	public ChaosDaemons() {
		this.setName("Daemons Of Chaos");
		this.setUnits(Arrays.asList(new BloodlettersOfKhorne(), new PinkHorrorsOfTzeentch(), new PlaguebearersOfNurgle(), new DaemonettesOfSlaanesh(), new ChaosFuries()));
	}
	
}
