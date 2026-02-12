package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {
    @Override
    public String getName() { return "Enchanted Robes"; }
    @Override
    public int getDefense() { return 10; }
    @Override
    public String getArmorType() { return "Light"; }
    @Override
    public String getArmorInfo() { return "Silk robes that provide magical protection."; }
}