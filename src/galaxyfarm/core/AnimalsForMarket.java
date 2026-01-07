package galaxyfarm.core;

import galaxyfarm.exceptions.AnimalExpiredException;
import galaxyfarm.exceptions.IncorrectNameException;

public interface AnimalsForMarket {
    void sellAnimal(Animal animal) throws AnimalExpiredException;
    int buyAnimal(Animal animal) throws IncorrectNameException;
}
