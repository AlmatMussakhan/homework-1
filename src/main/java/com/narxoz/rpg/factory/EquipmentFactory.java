package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public interface EquipmentFactory {
    Weapon createWeapon(); // Returns a weapon of the specific theme
    Armor createArmor();   // Returns armor of the specific theme
}