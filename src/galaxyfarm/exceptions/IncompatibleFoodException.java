package galaxyfarm.exceptions;

import galaxyfarm.core.FoodType;

public class IncompatibleFoodException extends Exception{
    private final String animalName;
    private final FoodType foodType;

    public IncompatibleFoodException(String animalName, FoodType foodType) {
        super(animalName + " не может есть " + foodType);
        this.animalName = animalName;
        this.foodType = foodType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public FoodType getFoodType() {
        return foodType;
    }
}