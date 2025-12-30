import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Fluffer fuf = new Fluffer("Fluffy", "air", false, "cloud", 12, 4);
        SunEater sunny = new SunEater("Sunny", "energizer", true, "crystal", 18, 5);
        ArrayList<Animals> animals = new ArrayList<>();
        animals.add(fuf);
        animals.add(sunny);
        ArrayList<String> items = new ArrayList<>();
        Ferm myFerm = new Ferm();

        myFerm.setGalAnimals(fuf);
        myFerm.getGalAnimals();
    }
}
