public class SunEater extends Animals implements Edible{
    public SunEater(String name, String type, boolean dangerous, String item, int costAnimal, int timer) {
        super(name, type, dangerous, item, costAnimal, timer);
    }

    @Override
    protected void makeSound() {

    }

    @Override
    protected void getItem() {

    }

    @Override
    public void eating(FoodType f) {

    }
}
