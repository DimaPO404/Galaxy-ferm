public abstract class Animals {
    protected String name;
    protected String type;
    protected boolean dangerous;
    protected String item;
    protected int costAnimal;
    protected int timer;

    public Animals(String name, String type, boolean dangerous, String item, int costAnimal, int timer) {
        this.name = name;
        this.type = type;
        this.dangerous = dangerous;
        this.item = item;
        this.costAnimal = costAnimal;
        this.timer = timer;
    }

    protected abstract void makeSound();

    protected abstract void getItem();
}
