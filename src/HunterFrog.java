public class HunterFrog extends Animals implements Edible{
    public HunterFrog(String name, String type, boolean dangerous, String item, int costAnimal, int timer, boolean alive) {
        super(name, type, dangerous, item, costAnimal, timer, alive);
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
