package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Mage implements Character {
    private String name;
    private int health = 80;
    private int mana = 150;
    private int strength = 20;
    private int intelligence = 90;
    private Weapon weapon;
    private Armor armor;

    public Mage(String name) {
        this.name = name;
    }

    @Override
    public String getName() { return name; }
    @Override
    public int getHealth() { return health; }
    @Override
    public int getMana() { return mana; }
    @Override
    public int getStrength() { return strength; }
    @Override
    public int getIntelligence() { return intelligence; }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " casts FIREBALL! Massive magic damage dealt!");
    }

    @Override
    public void equipWeapon(Weapon weapon) { this.weapon = weapon; }
    @Override
    public void equipArmor(Armor armor) { this.armor = armor; }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Mage) ===");
        System.out.println("Health: " + health + " | Mana: " + mana);
        System.out.println("Intelligence: " + intelligence + " | Strength: " + strength);
    }

    @Override
    public void displayEquipment() {
        System.out.println(name + "'s Equipment: [" +
                (weapon != null ? weapon.getName() : "No Weapon") + ", " +
                (armor != null ? armor.getName() : "No Armor") + "]");
    }
}