package com.narxoz.rpg.equipment;


public class PlateArmor implements Armor {

    private String name;
    private int defense;

    public PlateArmor() {
        this.name = "Plate Armor";
        this.defense = 50; // High defense for Warriors
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorType() {
        return "Heavy (Medieval)";
    }

    @Override
    public String getArmorInfo() {
        return "Plate Armor (Medieval) - Thick steel plates offering maximum protection.";
    }
}