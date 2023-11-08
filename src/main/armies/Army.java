/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies;


import java.util.List;

import main.Unit;

public class Army {
	private String name;
	private List<Unit> units;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Unit> getUnits() {
		return units;
	}
	public void setUnits(List<Unit> units) {
		this.units = units;
	}
	
	
	
}
