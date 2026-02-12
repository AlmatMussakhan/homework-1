package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public class Archer implements Character {
    private String name;
    private int health = 110;
    private int mana = 60;
    private int strength = 50;
    private int intelligence = 40;
    private Weapon weapon;
    private Armor armor;

    public Archer(String name) {
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
        System.out.println(name + " uses PIERCING SHOT! Ignores enemy armor!");
    }

    @Override
    public void equipWeapon(Weapon weapon) { this.weapon = weapon; }
    @Override
    public void equipArmor(Armor armor) { this.armor = armor; }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Archer) ===");
        System.out.println("Health: " + health + " | Mana: " + mana);
        System.out.println("Strength: " + strength + " | Intelligence: " + intelligence);
    }

    @Override
    public void displayEquipment() {
        System.out.println(name + "'s Equipment: [" +
                (weapon != null ? weapon.getName() : "No Weapon") + ", " +
                (armor != null ? armor.getName() : "No Armor") + "]");
    }
}