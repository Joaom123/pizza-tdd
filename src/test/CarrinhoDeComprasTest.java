package test;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import src.CarrinhoDeCompras;
import src.Pizza;

import java.net.StandardSocketOptions;

public class CarrinhoDeComprasTest {
    @Before
    public void zera(){
        Pizza.ingredientesDeTodasAsPizzas.clear();
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

    @Test
    public void totalDoPrecoParaUmaPizzaNoCarrinho() {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        Pizza pizza1 = new Pizza();

        pizza1.adicionaIngrediente("queijo");
        carrinhoDeCompras.adicionaPizza(pizza1);

        assertEquals(15, carrinhoDeCompras.valorTotal());
    }

    @Test
    public void totalDoPrecoParaDuasPizzasNoCarrinho() {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();

        pizza1.adicionaIngrediente("queijo");

        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("presunto");
        pizza2.adicionaIngrediente("presunto");

        carrinhoDeCompras.adicionaPizza(pizza1);
        carrinhoDeCompras.adicionaPizza(pizza2);

        assertEquals(15 + 20, carrinhoDeCompras.valorTotal());
    }

    @Test
    public void totalDoPrecoParaTresPizzasNoCarrinho() {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();

        pizza1.adicionaIngrediente("queijo");

        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("presunto");
        pizza2.adicionaIngrediente("presunto");

        pizza3.adicionaIngrediente("queijo");
        pizza3.adicionaIngrediente("presunto");
        pizza3.adicionaIngrediente("alho");
        pizza3.adicionaIngrediente("maionese");
        pizza3.adicionaIngrediente("catchup");
        pizza3.adicionaIngrediente("tomate");
        pizza3.adicionaIngrediente("tomate");
        pizza3.adicionaIngrediente("tomate");

        carrinhoDeCompras.adicionaPizza(pizza1);
        carrinhoDeCompras.adicionaPizza(pizza2);
        carrinhoDeCompras.adicionaPizza(pizza3);

        assertEquals(15 + 20 + 23, carrinhoDeCompras.valorTotal());
    }

    @Test
    public void quantidadeUtilizadaDeCadaIngrediente() {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza();
        Pizza pizza3 = new Pizza();

        pizza1.adicionaIngrediente("queijo");

        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("presunto");

        pizza3.adicionaIngrediente("queijo");
        pizza3.adicionaIngrediente("presunto");
        pizza3.adicionaIngrediente("alho");
        pizza3.adicionaIngrediente("maionese");
        pizza3.adicionaIngrediente("catchup");
        pizza3.adicionaIngrediente("tomate");
        pizza3.adicionaIngrediente("tomate");

        carrinhoDeCompras.adicionaPizza(pizza1);
        carrinhoDeCompras.adicionaPizza(pizza2);
        carrinhoDeCompras.adicionaPizza(pizza3);

        assertEquals(4, Pizza.quantidadeDeUmIngredienteEmTodasAsPizzas("queijo"));
        assertEquals(2, Pizza.quantidadeDeUmIngredienteEmTodasAsPizzas("presunto"));
        assertEquals(2, Pizza.quantidadeDeUmIngredienteEmTodasAsPizzas("tomate"));
        assertEquals(1, Pizza.quantidadeDeUmIngredienteEmTodasAsPizzas("alho"));
    }
}
