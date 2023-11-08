/*
 * Birddie721 2023
 * Full source code available on github: https://github.com/Birddie721/WarhammerFantasyCalculator
 */

package main;


public class Weapon {
	String weaponName;
	
	
	public Weapon(String WeaponName) {
		super();
		this.weaponName = WeaponName;
	}


	public static final Weapon HandWeapon = new Weapon("Hand Weapon");
	
	public static final Weapon Flail = new Weapon("Flail");
	
	public static final Weapon GreatWeapon = new Weapon("Great Weapon");
	
	public static final Weapon Halberd = new Weapon("Halberd");
	
	public static final Weapon LanceMounted = new Weapon("Mounted Lance");
	
	public static final Weapon MorningStar = new Weapon("Morning Star");
	
	public static final Weapon Spear = new Weapon("Spear");
	
	public static final Weapon SpearMounted = new Weapon("Mounted Spear");
	
	public static final Weapon AdditionalHandWeapons = new Weapon("Additional Hand Weapon");
	
	public static final Weapon HandWeaponAndShield = new Weapon("Hand Weapon and Shield");
	
	public static final Weapon SpearAndShield = new Weapon("Spear and Shield");



	public String getWeaponName() {
		return weaponName;
	}


}
