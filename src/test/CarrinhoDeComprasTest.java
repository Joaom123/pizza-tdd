package test;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import src.CarrinhoDeCompras;
import src.Pizza;

public class CarrinhoDeComprasTest {

    @Test
    public void carrinhoDeComprasInicializacao () {
        CarrinhoDeCompras cc = new CarrinhoDeCompras();
    }

    @Test
    public void adicionaUmaPizza() {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        Pizza pizza1 = new Pizza();

        pizza1.adicionaIngrediente("queijo");
        carrinhoDeCompras.adicionaPizza(pizza1);

        assertEquals(pizza1, carrinhoDeCompras.pizzas.get(0));
    }

    @Test
    public void adicionaDuasPizzas() {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();

        pizza1.adicionaIngrediente("queijo");

        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("presunto");

        carrinhoDeCompras.adicionaPizza(pizza1);
        carrinhoDeCompras.adicionaPizza(pizza2);

        assertEquals(pizza1, carrinhoDeCompras.pizzas.get(0));
        assertEquals(pizza2, carrinhoDeCompras.pizzas.get(1));
    }
}
