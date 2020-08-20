package test;

import exceptions.PizzaSemIngredienteException;
import org.junit.*;
import static org.junit.Assert.assertEquals;
import src.CarrinhoDeCompras;
import src.Pizza;

public class CarrinhoDeComprasTest {
    private Pizza pizza1;
    private Pizza pizza2;
    private Pizza pizza3;
    private CarrinhoDeCompras carrinhoDeCompras;


    @Before
    public void inicializa(){
        Pizza.ingredientesDeTodasAsPizzas.clear();
        carrinhoDeCompras = new CarrinhoDeCompras();
        pizza1 = new Pizza();
        pizza2 = new Pizza();
        pizza3 = new Pizza();
    }

    @Test
    public void adicionaUmaPizza() throws PizzaSemIngredienteException {
        pizza1.adicionaIngrediente("queijo");
        carrinhoDeCompras.adicionaPizza(pizza1);

        assertEquals(pizza1, carrinhoDeCompras.pizzas.get(0));
    }

    @Test
    public void adicionaDuasPizzas() throws PizzaSemIngredienteException {
        pizza1.adicionaIngrediente("queijo");

        pizza2.adicionaIngrediente("queijo");
        pizza2.adicionaIngrediente("presunto");

        carrinhoDeCompras.adicionaPizza(pizza1);
        carrinhoDeCompras.adicionaPizza(pizza2);

        assertEquals(pizza1, carrinhoDeCompras.pizzas.get(0));
        assertEquals(pizza2, carrinhoDeCompras.pizzas.get(1));
    }

    @Test
    public void totalDoPrecoParaUmaPizzaNoCarrinho() throws PizzaSemIngredienteException {
        pizza1.adicionaIngrediente("queijo");
        carrinhoDeCompras.adicionaPizza(pizza1);

        assertEquals(15, carrinhoDeCompras.valorTotal());
    }

    @Test
    public void totalDoPrecoParaDuasPizzasNoCarrinho() throws PizzaSemIngredienteException {
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
    public void totalDoPrecoParaTresPizzasNoCarrinho() throws PizzaSemIngredienteException {
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
    public void quantidadeUtilizadaDeCadaIngrediente() throws PizzaSemIngredienteException {
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

    @Test(expected = PizzaSemIngredienteException.class)
    public void adicionaPizzaSemIngrediente() throws PizzaSemIngredienteException {
        carrinhoDeCompras.adicionaPizza(pizza1);
    }
}
