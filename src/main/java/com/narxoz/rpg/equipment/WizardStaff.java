package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {
    @Override
    public String getName() { return "Wizard Staff"; }
    @Override
    public int getDamage() { return 15; }
    @Override
    public String getWeaponType() { return "Magic"; }
    @Override
    public String getWeaponInfo() { return "A staff infused with arcane energy."; }
}