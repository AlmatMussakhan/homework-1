package com.narxoz.rpg.equipment;

/**
 * Interface for all weapon types in the game.
 * This represents a "Product" in the Abstract Factory pattern.
 */
public interface Weapon {
    String getName();       // To show the weapon's name
    int getDamage();        // To show character stats
    String getWeaponType(); // To define theme (Medieval, Magic, etc.)
    String getWeaponInfo(); // For detailed demonstration output
}