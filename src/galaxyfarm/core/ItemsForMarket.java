package galaxyfarm.core;

import galaxyfarm.exceptions.IncorrectNameException;
import galaxyfarm.inventory.Item;

public interface ItemsForMarket {
    int sellItem(Item item) throws IncorrectNameException;
}
