/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main.armies.warriorsOfChaos;

import main.Unit;

public class ChaosUnit extends Unit{
	boolean markOfKhorne = false;
	boolean markOfTzeentch = false;
	boolean markOfNurgle = false;
	boolean markOfSlaanesh = false;
	
	
	public boolean isMarkOfKhorne() {
		return markOfKhorne;
	}


	public void setMarkOfKhorne(boolean markOfKhorne) {
		this.markOfKhorne = markOfKhorne;
	}


	public boolean isMarkOfTzeentch() {
		return markOfTzeentch;
	}


	public void setMarkOfTzeentch(boolean markOfTzeentch) {
		this.markOfTzeentch = markOfTzeentch;
	}


	public boolean isMarkOfNurgle() {
		return markOfNurgle;
	}


	public void setMarkOfNurgle(boolean markOfNurgle) {
		this.markOfNurgle = markOfNurgle;
	}


	public boolean isMarkOfSlaanesh() {
		return markOfSlaanesh;
	}


	public void setMarkOfSlaanesh(boolean markOfSlaanesh) {
		this.markOfSlaanesh = markOfSlaanesh;
	}


	public ChaosUnit() {
		
	}
}
