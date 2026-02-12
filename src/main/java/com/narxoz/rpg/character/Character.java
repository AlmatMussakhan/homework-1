package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

/**
 * Base interface for the "Product" in the Factory Method pattern.
 */
public interface Character {
    String getName();
    int getHealth();
    int getMana();
    int getStrength();
    int getIntelligence();

    void useSpecialAbility();
    void displayStats();

    void equipWeapon(Weapon weapon);
    void equipArmor(Armor armor);
    void displayEquipment();
}