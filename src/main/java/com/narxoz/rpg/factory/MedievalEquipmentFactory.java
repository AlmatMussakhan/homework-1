package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.*;

public class MedievalEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new IronSword(); // Family: Medieval
    }

    @Override
    public Armor createArmor() {
        return new PlateArmor(); // Family: Medieval
    }
}