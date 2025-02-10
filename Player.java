package DesignPattern.game;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private int experience;
    private List<String> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public void takeDamage(int damage) {
        health -= damage;
        System.out.println(name + " took " + damage + " damage. Health: " + health);
    }

    public void gainExperience(int xp) {
        experience += xp;
        System.out.println(name + " gained " + xp + " experience. Total XP: " + experience);
    }

    public void addItem(String item) {
        inventory.add(item);
        System.out.println(name + " picked up: " + item);
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }

    public boolean isAlive() {
        return health > 0;
    }

    // ✅ Corrected method
    public String getName() {
        return name;
    }
}
