package src;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    public ArrayList<Pizza> pizzas;

    public CarrinhoDeCompras() {
        pizzas = new ArrayList<>();
    }

    public void adicionaPizza(Pizza pizza) {
        //TODO: Lançar exceção
        if (pizza.temAlgumIngrediente())
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
