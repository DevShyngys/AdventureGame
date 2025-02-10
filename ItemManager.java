package DesignPattern.game;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {
    private List<String> items;

    public ItemManager() {
        this.items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    public boolean hasItems() {
        return !items.isEmpty();
    }

    public String getNextItem() {
        return items.isEmpty() ? null : items.get(0);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public int getHealthBoost(String item) {
        return "Health Elixir".equals(item) ? 20 : 0;
    }

    public int getXPBoost(String item) {
        return switch (item) {
            case "Gold Coin" -> 5;
            case "Magic Scroll" -> 15;
            default -> 0;
        };
    }
}
