package src;

import java.util.ArrayList;

public class CarrinhoDeCompras {
    public ArrayList<Pizza> pizzas;

    public CarrinhoDeCompras() {
        pizzas = new ArrayList<>();
    }

    public void adicionaPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

}
