package com.narxoz.rpg.equipment;


public interface Weapon {
    String getName();       // To show the weapon's name
    int getDamage();        // To show character stats
    String getWeaponType(); // To define theme (Medieval, Magic, etc.)
    String getWeaponInfo(); // For detailed demonstration output
}