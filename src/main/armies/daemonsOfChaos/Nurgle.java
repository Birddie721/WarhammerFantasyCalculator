/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.daemonsOfChaos;

public class Nurgle extends DaemonsUnit{
	public Nurgle() {
		this.setToHitMod(this.getToHitMod()-1);
	}
}
