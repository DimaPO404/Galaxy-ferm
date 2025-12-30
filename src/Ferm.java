import java.util.ArrayList;

public class Ferm {
    private ArrayList<Animals> galAnimals;
    private int money;
    private ArrayList<String> items;

    public void setGalAnimals(Animals a) {
        money -= a.costAnimal;
        galAnimals.add(a);
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setItems(ArrayList<String> items) {
        this.items = items;
    }

    public ArrayList<Animals> getGalAnimals() {
        return galAnimals;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void deleteAnimal() {}

    public void sellItem() {}

    public void getAnimals() {
        for (int i = 0; i < galAnimals.size(); i++) {
            System.out.println(galAnimals.get(i));
        }
    }
}
