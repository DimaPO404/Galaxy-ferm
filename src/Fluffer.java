public class Fluffer extends Animals implements Edible{
    public Fluffer(String name, String type, boolean dangerous, String item, int costAnimal, int timer, boolean alive) {
        super(name, type, dangerous, item, costAnimal, timer, alive);
    }

    @Override
    protected void makeSound() {
        System.out.println("Ffffffffffff");
    }

    @Override
    protected void getItem() {

    }

    @Override
    public void eating(FoodType f) {
        if (f == FoodType.PLANT) {
            System.out.println("Животное сытое и довольное!\n");

            double chance = Math.random();
            if (chance < 0.25) {
                System.out.println("А также ты получил новый предмет!");
                
            }

        }
    }

    @Override
    public String toString() {
        return String.format("%s | %s | Опасность: %b | %s | %d | %d", name, type, dangerous, item, costAnimal, timer);
    }
}
