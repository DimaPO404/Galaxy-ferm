package galaxyfarm.exceptions;

public class IncorrectNameException extends Exception{
    public IncorrectNameException() {
        super("Имя введено неверно, попробуйте ещё раз");
    }
}
