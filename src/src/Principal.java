package src;

public class Principal {
    public static void main(String[] args) {
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

        System.out.println("Total do carrinho: " + carrinhoDeCompras.valorTotal());
        System.out.println(Pizza.ingredientesDeTodasAsPizzas);

    }
}
