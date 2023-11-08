/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main;

import java.util.List;

public class Unit {
	String name;
	double points;
	int M;
	int WS;
	int BS;
	int S;
	int T;
	int W;
	int I;
	int A;
	int LD;
	int units;
	int attacks;
	int armorSave = 7;
	int wardSave = 7;
	
	boolean isAttacker;
	
	private List<Weapon> weapons;
	private int[] weaponCosts;
	private int weaponCost;
	
	boolean alwaysStrikesFirst = false;
	boolean alwaysStrikesLast = false;
	Weapon selectedWeapon;
	int rankWidth = 10;
	int ranks;
	boolean hasShield = false;
	int unitsInNotFullRank;
	int attackInExtraRanks = 0;
	boolean causesFear = false;
	boolean killingBlow = false;
	boolean poisonedAttacks = false;
	boolean immuneToPsychology = false;
	boolean isStubborn = false;
	boolean isUnbreakable = false;
	int armorPierce = 0;
	boolean frenzy = false;
	int toHitMod = 0;
	boolean hatred = false;
	boolean eternalHatred = false;

	public int getM() {
		return M;
	}
	public void setM(int m) {
		M = m;
	}
	public int getWS() {
		return WS;
	}
	public void setWS(int wS) {
		WS = wS;
	}
	public int getBS() {
		return BS;
	}
	public void setBS(int bS) {
		BS = bS;
	}
	public int getS() {
		return S;
	}
	public void setS(int s) {
		S = s;
	}
	public int getT() {
		return T;
	}
	public void setT(int t) {
		T = t;
	}
	public int getW() {
		return W;
	}
	public void setW(int w) {
		W = w;
	}
	public int getI() {
		return I;
	}
	public void setI(int i) {
		I = i;
	}
	public int getA() {
		return A;
	}
	public void setA(int a) {
		A = a;
	}
	public int getLD() {
		return LD;
	}
	public void setLD(int lD) {
		LD = lD;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int Units) {
		units = Units;
		ranks = units/rankWidth;
		unitsInNotFullRank = units%rankWidth;
	}
	public int getAttacks() {
		return attacks;
	}
	public void setAttacks(int Attacks) {
		attacks = Attacks;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		name = Name;
	}
	
	public void kill(int deaths) {
		units -= deaths;
		if (units < 0) {
			units = 0;
		}else {
			ranks = units/rankWidth;
			unitsInNotFullRank = units%rankWidth;
		}
	}
	public int getArmorSave() {
		return armorSave;
	}
	public void setArmorSave(int armorSave) {
		this.armorSave = armorSave;
	}
	public int getWardSave() {
		return wardSave;
	}
	public void setWardSave(int wardSave) {
		this.wardSave = wardSave;
	}
	
	public void setNewAttacks() {
		
	}
	public double getPoints() {
		return points;
	}
	public void setPoints(double points) {
		this.points = points;
	}
	public boolean isAlwaysStrikesFirst() {
		return alwaysStrikesFirst;
	}
	public void setAlwaysStrikesFirst(boolean alwaysStrikesFirst) {
		this.alwaysStrikesFirst = alwaysStrikesFirst;
	}
	public boolean isAlwaysStrikesLast() {
		return alwaysStrikesLast;
	}
	public void setAlwaysStrikesLast(boolean alwaysStrikesLast) {
		this.alwaysStrikesLast = alwaysStrikesLast;
	}
	public List<Weapon> getWeapons() {
		return weapons;
	}
	public void setWeapons(List<Weapon> weapon) {
		this.weapons = weapon;
	}
	
	public int getRankWidth() {
		return rankWidth;
	}
	public void setRankWidth(int rankWidth) {
		this.rankWidth = rankWidth;
	}
	public int getRanks() {
		return ranks;
	}
	public boolean isHasShield() {
		return hasShield;
	}
	public void setHasShield(boolean hasShield) {
		this.hasShield = hasShield;
	}
	public int getUnitsInNotFullRank() {
		return unitsInNotFullRank;
	}
	public int getAttackInExtraRanks() {
		return attackInExtraRanks;
	}
	public void setAttackInExtraRanks(int attackInExtraRanks) {
		this.attackInExtraRanks = attackInExtraRanks;
	}

	public boolean isCausesFear() {
		return causesFear;
	}
	public void setCausesFear(boolean fear) {
		causesFear = fear;
	}
	public boolean isKillingBlow() {
		return killingBlow;
	}
	public void setKillingBlow(boolean killingBlow) {
		this.killingBlow = killingBlow;
	}
	public boolean isPoisonedAttacks() {
		return poisonedAttacks;
	}
	public void setPoisonedAttacks(boolean poisonedAttacks) {
		this.poisonedAttacks = poisonedAttacks;
	}
	public boolean isImmuneToPsychology() {
		return immuneToPsychology;
	}
	public void setImmuneToPsychology(boolean immuneToPsychology) {
		this.immuneToPsychology = immuneToPsychology;
	}
	
	public String toString() {
		return this.getName();
	}
	public void setWeapon(Weapon weapon) {
		this.selectedWeapon = weapon;
	}
	public void setWeaponCosts(int[] costs) {
		this.weaponCosts = costs;
	}
	public void setWeaponCostIndex(int costIndex) {
		this.weaponCost = weaponCosts[costIndex];
	}
	public int getWeaponCost() {
		return this.weaponCost;
	}
	public Weapon getWeapon() {
		return this.selectedWeapon;
	}
	public void setIsAttacker(boolean attacker) {
		this.isAttacker = attacker;
	}
	public boolean isAttacker() {
		return isAttacker;
	}
	public boolean getStubborn() {
		return isStubborn;
	}
	public void setStubborn(boolean isStubborn) {
		this.isStubborn = isStubborn;
	}
	public boolean getUnbreakable() {
		return isUnbreakable;
	}
	public void setUnbreakable(boolean isUnbreakable) {
		this.isUnbreakable = isUnbreakable;
		this.immuneToPsychology = isUnbreakable;
	}
	public int getArmorPierce() {
		return armorPierce;
	}
	public void setArmorPierce(int armorPierce) {
		this.armorPierce = armorPierce;
	}
	public boolean isFrenzy() {
		return frenzy;
	}
	public void setFrenzy(boolean frenzy) {
		this.frenzy = frenzy;
		if(!this.isUnbreakable) {
			this.immuneToPsychology = frenzy;
		}
	}
	public int getToHitMod() {
		return toHitMod;
	}
	public void setToHitMod(int toHitMod) {
		this.toHitMod = toHitMod;
	}
	public boolean hasHatred() {
		return hatred;
	}
	public void setHatred(boolean hatred) {
		this.hatred = hatred;
	}
	public boolean isEternalHatred() {
		return eternalHatred;
	}
	public void setEternalHatred(boolean eternalHatred) {
		this.eternalHatred = eternalHatred;
	}
	
}
