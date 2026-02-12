package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.factory.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharacterFactory charFactory = new CharacterFactory();

        System.out.println("=== RPG Character Creation System ===");

        // 1. Character Creation via Console
        System.out.print("Enter your character's name: ");
        String name = scanner.nextLine();

        System.out.print("Choose class (Warrior, Mage, Archer): ");
        String type = scanner.nextLine().toUpperCase();

        Character userHero = charFactory.createCharacter(type, name);

        if (userHero == null) {
            System.out.println("Invalid class type. Exiting...");
            return;
        }

        // 2. Equipment Selection via Console
        System.out.println("\nChoose an equipment theme:");
        System.out.println("1. Medieval (Sword & Plate)");
        System.out.println("2. Magic (Staff & Robes)");
        System.out.println("3. Ranger (Bow & Leather)");
        System.out.print("Selection (1-3): ");

        int choice = scanner.nextInt();
        EquipmentFactory selectedFactory;

        switch (choice) {
            case 1:
                selectedFactory = new MedievalEquipmentFactory();
                break;
            case 2:
                selectedFactory = new MagicEquipmentFactory();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Medieval.");
                selectedFactory = new MedievalEquipmentFactory();
                break;
        }

        // 3. Applying Patterns
        equipCharacter(userHero, selectedFactory);

        // 4. Displaying Results
        System.out.println("\n--- Final Character Summary ---");
        displayCharacterInfo(userHero);

        System.out.println("=== Adventure Starts Now ===");
        scanner.close();
    }

    private static void equipCharacter(Character character, EquipmentFactory factory) {
        Weapon weapon = factory.createWeapon();
        Armor armor = factory.createArmor();
        character.equipWeapon(weapon);
        character.equipArmor(armor);
    }

    private static void displayCharacterInfo(Character character) {
        character.displayStats();
        character.useSpecialAbility();
        character.displayEquipment();
    }
}