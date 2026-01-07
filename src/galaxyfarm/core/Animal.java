package galaxyfarm.core;

public abstract class Animal {
    protected String name;
    protected String type;
    protected boolean dangerous;
    protected int cost;
    protected boolean alive;
    protected int maxLifespan;
    protected int currentAge;

    public Animal(String name, String type, boolean dangerous, int cost, boolean alive, int maxLifespan, int currentAge) {
        this.name = name;
        this.type = type;
        this.dangerous = dangerous;
        this.cost = cost;
        this.alive = alive;
        this.maxLifespan = maxLifespan;
        this.currentAge = 0;
    }

    public boolean isAlive() {return alive;}

    public abstract void makeSound();

    public void ageOneDay() {
        currentAge++;
    }

}