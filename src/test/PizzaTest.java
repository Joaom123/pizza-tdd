package test;

import src.Pizza;
import org.junit.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class PizzaTest {

    @Test
    public void adicionaIngrediente() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");

        ArrayList<String> ingredientes = new ArrayList<String>();
        ingredientes.add("queijo");

        assertEquals(ingredientes, pizza.ingredientes);
    }

    @Test
    public void precoAte2Ingredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");

        int precoDaPizza = 15;

        assertEquals(precoDaPizza, pizza.getPreco());
    }

}
