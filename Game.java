package DesignPattern.game;


public class Game {
    private Player player;
    private EnemyManager enemyManager;
    private ItemManager itemManager;
    private LevelManager levelManager;

    public Game() {
        player = new Player("Shyngys, the adventurer");
        enemyManager = new EnemyManager();
        itemManager = new ItemManager();
        levelManager = new LevelManager();

        // Initial enemies and items
        enemyManager.addEnemy("Skeleton");
        enemyManager.addEnemy("Zombie");
        itemManager.addItem("Gold Coin");
        itemManager.addItem("Health Elixir");
    }

    public void fightEnemy(String enemy) {
        System.out.println(player.getName() + " engages in combat with " + enemy);
        player.takeDamage(enemyManager.getDamage(enemy));
        player.gainExperience(enemyManager.getXP(enemy));
        enemyManager.removeEnemy(enemy);
    }

    public void pickUpItem(String item) {
        player.addItem(item);
        player.gainExperience(itemManager.getXPBoost(item));
        player.takeDamage(-itemManager.getHealthBoost(item));
        itemManager.removeItem(item);
    }

    public void playGame() {
        while (player.isAlive() && !levelManager.isFinalLevel()) {
            System.out.println("\n=== Level " + levelManager.getLevel() + " ===");

            while (enemyManager.hasEnemies() && player.isAlive()) {
                fightEnemy(enemyManager.getNextEnemy());
            }

            while (itemManager.hasItems()) {
                pickUpItem(itemManager.getNextItem());
            }

            if (player.isAlive()) {
                levelManager.advanceLevel();
                setupNextLevel();
            }
        }

        if (player.isAlive()) {
            System.out.println("\n🎉 " + player.getName() + " completed the adventure with " + player.getExperience() + " XP!");
        } else {
            System.out.println("\n💀 " + player.getName() + " has perished. Game Over.");
        }
    }

    private void setupNextLevel() {
        enemyManager = new EnemyManager();
        itemManager = new ItemManager();

        if (levelManager.getLevel() == 2) {
            enemyManager.addEnemy("Vampire");
            itemManager.addItem("Magic Scroll");
        } else if (levelManager.getLevel() == 3) {
            enemyManager.addEnemy("Vampire");
            enemyManager.addEnemy("Zombie");
            itemManager.addItem("Health Elixir");
            itemManager.addItem("Gold Coin");
        }
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.playGame();
    }
}


