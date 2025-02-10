package DesignPattern.game;

public class LevelManager {
    private int level;

    public LevelManager() {
        this.level = 1;
    }

    public void advanceLevel() {
        level++;
        System.out.println("Advancing to level " + level);
    }

    public int getLevel() {
        return level;
    }

    public boolean isFinalLevel() {
        return level >= 3;
    }
}

