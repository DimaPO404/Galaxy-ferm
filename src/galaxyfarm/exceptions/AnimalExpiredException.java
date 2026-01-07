package galaxyfarm.exceptions;

public class AnimalExpiredException extends Exception {
    public AnimalExpiredException() {
        super("Животное уже мертво, такое не примут в продажу...");
    }
}
