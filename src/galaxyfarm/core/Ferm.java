package galaxyfarm.core;

import galaxyfarm.exceptions.AnimalExpiredException;
import galaxyfarm.inventory.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ferm {
    private List<Animal> galaxyAnimals = new ArrayList<>();
    private Market market = new Market();

    public void nextDay() {
        System.out.println("НОВЫЙ ДЕНЬ");

        Iterator<Animal> iterator = galaxyAnimals.iterator();
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            animal.ageOneDay();

            if (!animal.isAlive()) {
                try {
                    throw new AnimalExpiredException();
                } catch (AnimalExpiredException e) {
                    System.out.println("Сегодня умер " + e.getMessage() + " ...");
                    iterator.remove();
                    applyDeathPenalty();
                }
            }
        }
    }
    private void applyDeathPenalty() {
        market.changeMoney(5);
    }
}
