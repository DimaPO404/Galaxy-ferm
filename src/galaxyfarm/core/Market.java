package galaxyfarm.core;

import galaxyfarm.exceptions.AnimalExpiredException;
import galaxyfarm.exceptions.IncorrectNameException;
import galaxyfarm.inventory.Item;

public class Market implements AnimalsForMarket, ItemsForMarket{
    private int money;

    public void changeMoney(int amount) {
        money -= amount;
    }

    @Override
    public void sellAnimal(Animal animal) throws AnimalExpiredException {
        if (!animal.alive) {
            throw new AnimalExpiredException();
        }
        money += animal.cost / 2;
    }

    @Override
    public int buyAnimal(Animal animal) throws IncorrectNameException {
        return 0;
    }

    @Override
    public int sellItem(Item item) throws IncorrectNameException {
        return 0;
    }
}

//бизнесовая логика, купля/продажа