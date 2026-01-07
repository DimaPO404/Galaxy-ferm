package galaxyfarm.core;

import galaxyfarm.exceptions.IncompatibleFoodException;
import galaxyfarm.inventory.Item;

import java.util.Optional;

public interface Edible {
    boolean canEat(FoodType food);
    Item feed(FoodType food) throws IncompatibleFoodException;
}
