import java.util.ArrayList;

public class Ferm {
    private ArrayList<Animals> galAnimals;
    private int money;
    private ArrayList<String> items;
    private int foodStock;

    public Ferm() {
        this.galAnimals = new ArrayList<Animals>();
        this.money = 100;
        this.items = new ArrayList<String>();
        this.foodStock = 10;
    }

    public void addGalAnimals(Animals a) {
        if (money > a.costAnimal * 2) {
            money -= a.costAnimal * 2;
            galAnimals.add(a);
        }
        else System.out.println("В продаже отказано, увеличьте свой капитал");
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

    public void setFoodStock(int foodColvo) {
        this.foodStock = foodColvo;
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<String> getItems() {
        return items;
    }

    public void deleteAnimal() {
        for (int i = 0; i < galAnimals.size(); i++) {
            if (!galAnimals.get(i).alive) {
                galAnimals.remove(i);
                money -= 5;
            }
        }
        System.out.println("На вашей ферме остались только здоровые животные!");
    }

    public void sellItem(String it) {
        for (int i = 0; i < items.size(); i++) {
            items.remove(it);
            switch (it) {
                case "":
                    money += 12;
            }
        }
    }

    public void getAnimals() {
        for (int i = 0; i < galAnimals.size(); i++) {
            System.out.println(galAnimals.get(i));
        }
    }

    public int getFoodStock() {
        return foodStock;
    }
}
