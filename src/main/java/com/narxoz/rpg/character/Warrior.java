package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

/**
 * Concrete implementation of a Character for the Warrior class.
 * This class represents a "Concrete Product" in the Factory Method pattern.
 */
public class Warrior implements Character {

    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;

    // Fields for equipped items from the Abstract Factory
    private Weapon weapon;
    private Armor armor;

    public Warrior(String name) {
        this.name = name;
        // Warrior stats: high health and strength, low mana and intelligence
        this.health = 150;
        this.mana = 30;
        this.strength = 80;
        this.intelligence = 20;
    }

    @Override
    public String getName() {
        return name;
    }

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
        System.out.println(name + " uses BERSERKER RAGE! Strength temporarily increased!");
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        System.out.println(name + " equipped: " + weapon.getName());
    }

    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
        System.out.println(name + " put on: " + armor.getName());
    }

    @Override
    public void displayStats() {
        System.out.println("=== " + name + " (Warrior) ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
        displayEquipment();
    }

    @Override
    public void displayEquipment() {
        System.out.println("Current Equipment:");
        System.out.println("- Weapon: " + (weapon != null ? weapon.getWeaponInfo() : "None"));
        System.out.println("- Armor: " + (armor != null ? armor.getArmorInfo() : "None"));
    }
}