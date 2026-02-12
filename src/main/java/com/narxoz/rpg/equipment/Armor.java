package com.narxoz.rpg.equipment;

/**
 * Interface for all armor types in the game.
 * This represents another "Product" in the Abstract Factory pattern.
 */
public interface Armor {
    String getName();
    int getDefense();
    String getArmorType(); // e.g., Light, Medium, Heavy
    String getArmorInfo();
}