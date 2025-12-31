public abstract class Animals {
    protected String name;
    protected String type;
    protected boolean dangerous;
    protected String item;
    protected int costAnimal;
    protected int timer;
    protected boolean alive;

    public Animals(String name, String type, boolean dangerous, String item, int costAnimal, int timer, boolean alive) {
        this.name = name;
        this.type = type;
        this.dangerous = dangerous;
        this.item = item;
        this.costAnimal = costAnimal;
        this.timer = timer;
        this.alive = alive;
    }

    protected abstract void makeSound();

    protected abstract void getItem();
}
