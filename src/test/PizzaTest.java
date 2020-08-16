package test;

import org.junit.Test;
import src.Pizza;

public class PizzaTest {

    @Test
    public void adicionaIngrediente() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
    }
}
