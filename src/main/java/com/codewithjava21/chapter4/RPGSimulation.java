package com.codewithjava21.chapter4;

import java.util.*;

public class RPGSimulation {
    record Monster(String name, int attack, int maxDamage, int defense) {
        static Random random = new Random();
        static int hitPoints = 2;
        static boolean alive = true;

        public int rollAttack() {
            return random.nextInt(attack);
        }

        public int rollDamage() {
            return random.nextInt(maxDamage);
        }

        public static boolean isAlive() {
            return alive;
        }
    }

    public static void main(String[] args) {
        Random randomNumber = new Random();
        int monsterCount = randomNumber.nextInt(4) + 1;
        List<Monster> monsters = new ArrayList<>();

        for (int monstedIdx = 0; monstedIdx < monsterCount; monstedIdx++) {
            int typeIdx = randomNumber.nextInt(4);

            switch (typeIdx) {
                case 0 -> monsters.add(new Monster("Kobald", 2, 8, 1));
                case 1 -> monsters.add(new Monster("Skeleton", 2, 8, 2));
                case 2 -> monsters.add(new Monster("Zombie", 1, 6, 2));
                default -> monsters.add(new Monster("Rat", 1, 4, 1));
            }
        }

        Map<String, String> spellbook = new TreeMap<>();
        spellbook.put("Fireball", "A ball of fire that inflicts 8 damage per level of magic.");
        spellbook.put("Healing Touch", "Touching an injured player recovers 5 hit points per character level.");
        spellbook.put("Lightning Bolt", "A stream of lightning that inflicts 10 damage per level of magic.");
        spellbook.put("Create Water", "Creates 10 liters of water per level of magic.");
        spellbook.put("Transmutation", "Converts common items into gold.");
    }
}
