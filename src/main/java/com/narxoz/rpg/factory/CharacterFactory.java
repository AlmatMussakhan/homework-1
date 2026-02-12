package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Warrior;
import com.narxoz.rpg.character.Mage;
import com.narxoz.rpg.character.Archer;

public class CharacterFactory {

    public Character createCharacter(String type, String name) {
        if (type.equalsIgnoreCase("WARRIOR")) return new Warrior(name);
        if (type.equalsIgnoreCase("MAGE")) return new Mage(name);
        if (type.equalsIgnoreCase("ARCHER")) return new Archer(name);
        return null;
    }
}