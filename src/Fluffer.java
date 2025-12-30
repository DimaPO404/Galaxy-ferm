public class Fluffer extends Animals implements Edible{
    public Fluffer(String name, String type, boolean dangerous, String item, int costAnimal, int timer) {
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

    @Override
    public String toString() {
        return String.format("%s | %s | Опасность: %b | %s | %d | %d", name, type, dangerous, item, costAnimal, timer);
    }
}
