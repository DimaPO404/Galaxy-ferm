package galaxyfarm.core;

import galaxyfarm.exceptions.IncompatibleFoodException;
import galaxyfarm.inventory.Inventory;
import galaxyfarm.inventory.Item;
import galaxyfarm.inventory.Rarity;

import java.util.Optional;

public class Fluffer extends Animal implements Edible{
    public Fluffer(String name, String type, boolean dangerous, int cost, boolean alive, int maxLifespan, int currentAge) {
        super(name, type, dangerous, cost, alive, maxLifespan, currentAge);
    }

    public String getName() {return name;}

    public String getType() {return type;}

    public boolean isDangerous() {return dangerous;}

    public int getCost() {return cost;}

    @Override
    public boolean isAlive() {return alive;}

    public int maxLifespan() {return maxLifespan; }

    public int currentAge() {return currentAge; }

    @Override
    public boolean canEat(FoodType food) {
        return food == FoodType.PLANT;
    }

    @Override
    public Item feed(FoodType food) throws IncompatibleFoodException {
        if (!canEat(food)) {
            throw new IncompatibleFoodException(name, food);
        }
        double chance = (int) (Math.random() * 100);
        if (chance < 5) {
            return new Item("Fluff", Rarity.STRANGE, 100);
        } else if (chance < 20) {
            return new Item("Fluff", Rarity.RARE, 50);
        } else if (chance < 75) {
            return new Item("Fluff", Rarity.COMMON, 15);
        } else return null;
    }

    @Override
    public void makeSound() {
        System.out.println("FRFRFRFRFRFRF");
    }

    @Override
    public void ageOneDay() {
        super.ageOneDay();
    }

    @Override
    public String toString() {
        return String.format("Имя: %s | Тип: %s | Опасность: %b | Цена: %d | Жизнь: %b", name, type,
                dangerous, cost, alive);
    }
}