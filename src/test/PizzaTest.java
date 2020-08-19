package test;

import src.Pizza;
import java.util.ArrayList;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class PizzaTest {
    @Before
    public void zeraVariaveisEstaticas() {
        Pizza.ingredientesDeTodasAsPizzas.clear();
    }

    @Test
    public void adicionaIngrediente() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");

        ArrayList<String> ingredientes = new ArrayList<>();
        ingredientes.add("queijo");

        assertEquals(ingredientes, pizza.ingredientes);
    }

    @Test
    public void precoDaPizzaComUmIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");

        int precoDaPizza = 15;

        assertEquals(precoDaPizza, pizza.getPreco());
    }

    @Test
    public void precoDaPizzaComDoisIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("presunto");

        int precoDaPizza = 15;

        assertEquals(precoDaPizza, pizza.getPreco());
    }

    @Test
    public void precoDaPizzaComTresIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("presunto");
        pizza.adicionaIngrediente("alho");

        int precoDaPizza = 20;

        assertEquals(precoDaPizza, pizza.getPreco());
    }

    @Test
    public void precoDaPizzaComQuatroIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("presunto");
        pizza.adicionaIngrediente("alho");
        pizza.adicionaIngrediente("maionese");

        int precoDaPizza = 20;

        assertEquals(precoDaPizza, pizza.getPreco());
    }

    @Test
    public void precoDaPizzaComCincoIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("presunto");
        pizza.adicionaIngrediente("alho");
        pizza.adicionaIngrediente("maionese");
        pizza.adicionaIngrediente("catchup");

        int precoDaPizza = 20;

        assertEquals(precoDaPizza, pizza.getPreco());
    }

    @Test
    public void precoDaPizzaComSeisIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("presunto");
        pizza.adicionaIngrediente("alho");
        pizza.adicionaIngrediente("maionese");
        pizza.adicionaIngrediente("catchup");
        pizza.adicionaIngrediente("tomate");

        int precoDaPizza = 23;

        assertEquals(precoDaPizza, pizza.getPreco());
    }

    @Test
    public void precoDaPizzaComSeteIngredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("queijo");
        pizza.adicionaIngrediente("presunto");
        pizza.adicionaIngrediente("alho");
        pizza.adicionaIngrediente("maionese");
        pizza.adicionaIngrediente("catchup");
        pizza.adicionaIngrediente("tomate");
        pizza.adicionaIngrediente("tomate");
        pizza.adicionaIngrediente("tomate");

        int precoDaPizza = 23;

        assertEquals(precoDaPizza, pizza.getPreco());
    }

    @Test
    public void contabilizaIngredientes() {
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("queijo");
        pizza1.adicionaIngrediente("presunto");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("alho");

        assertEquals(1, Pizza.quantidadeDeUmIngredienteEmTodasAsPizzas("presunto"));
        assertEquals(2, Pizza.quantidadeDeUmIngredienteEmTodasAsPizzas("queijo"));
        assertEquals(1, Pizza.quantidadeDeUmIngredienteEmTodasAsPizzas("alho"));
    }
}
