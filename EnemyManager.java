package DesignPattern.game;

import java.util.ArrayList;
import java.util.List;

public class EnemyManager {
    private List<String> enemies;

    public EnemyManager() {
        this.enemies = new ArrayList<>();
    }

    public void addEnemy(String enemy) {
        enemies.add(enemy);
    }

    public boolean hasEnemies() {
        return !enemies.isEmpty();
    }

    public String getNextEnemy() {
        return enemies.isEmpty() ? null : enemies.get(0);
    }

    public void removeEnemy(String enemy) {
        enemies.remove(enemy);
    }

    public int getDamage(String enemy) {
        return switch (enemy) {
            case "Skeleton" -> 10;
            case "Zombie" -> 15;
            case "Vampire" -> 25;
            default -> 0;
        };
    }

    public int getXP(String enemy) {
        return switch (enemy) {
            case "Skeleton" -> 20;
            case "Zombie" -> 30;
            case "Vampire" -> 50;
            default -> 0;
        };
    }
}
