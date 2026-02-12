package com.narxoz.rpg.equipment;


public class IronSword implements Weapon {

    private String name;
    private int damage;
    private String weaponType;

    public IronSword() {
        this.name = "Iron Sword";
        this.damage = 25;
        this.weaponType = "Melee (Medieval)";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    @Override
    public String getWeaponInfo() {
        return "Iron Sword (Medieval) - A sturdy blade forged from iron";
    }
}