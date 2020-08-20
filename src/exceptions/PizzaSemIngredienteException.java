package exceptions;

public class PizzaSemIngredienteException extends Exception{
    public PizzaSemIngredienteException() {
        super("Pizza sem ingrediente!");
    }
}
