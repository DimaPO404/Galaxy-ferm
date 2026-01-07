package galaxyfarm.inventory;

public class Item {
    private String name;
    private Rarity rarity;
    private int price;

    public Item(String name, Rarity rare, int price) {
        this.name = name;
        this.rarity = rarity;
        this.price = price;
    }

    public String getName() { return name; }

    public Rarity getRarity() { return rarity; }

    public int getPrice() { return price; }

    public int getRarityLevel() {
        return switch (rarity) {
            case COMMON -> 1;
            case RARE -> 2;
            case STRANGE -> 3;
        };
    }

    @Override
    public String toString() {
        return String.format("название: %s | Редкость: %s | Цена: %d", name, rarity, price);
    }
}