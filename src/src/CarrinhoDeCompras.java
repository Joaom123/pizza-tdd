package src;

import exceptions.PizzaSemIngredienteException;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    public ArrayList<Pizza> pizzas;

    public CarrinhoDeCompras() {
        pizzas = new ArrayList<>();
    }

    public void adicionaPizza(Pizza pizza) throws PizzaSemIngredienteException {
        if (!pizza.temAlgumIngrediente())
            throw new PizzaSemIngredienteException();
        pizzas.add(pizza);
    }

    public int valorTotal() {
        int valorTotal = 0;

        for (Pizza pizza : pizzas) {
            valorTotal += pizza.getPreco();
        }

        return valorTotal;
    }
}
