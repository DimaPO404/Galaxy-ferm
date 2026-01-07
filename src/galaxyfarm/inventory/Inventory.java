package galaxyfarm.inventory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Inventory {
    private List<Item> items = new ArrayList<>();

    public List<Item> findItems(String query) {
        return items.stream().filter(item -> item.getName()
                .toLowerCase().contains(query.toLowerCase()))
                .collect(Collectors.toList());
    }

    public void sortByRarity() {
        items.sort(Comparator.comparingInt(Item::getRarityLevel));
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Вам выпал предмет! " + item.getName()
        + " редкость: " + item.getRarity());
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public void checkInventory() {
        for (Item item : items)
            System.out.println(item);
    }
}
