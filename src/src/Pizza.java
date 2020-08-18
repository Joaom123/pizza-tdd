package src;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Pizza {
    public List<String> ingredientes;
    public static HashMap<String, Integer> ingredientesDeTodasAsPizzas = new HashMap<>();

    public Pizza() {
        ingredientes = new ArrayList<>();
    }

    public void adicionaIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
        contabilizaIngrediente(ingrediente);
    }

    public int getPreco() {
        int quantidadeDeIngredientes = ingredientes.size();

        if(quantidadeDeIngredientes < 3)
            return 15;

        if(quantidadeDeIngredientes < 6)
            return 20;

        return 23;
    }

    private static void contabilizaIngrediente(String ingrediente) {
        if(!ingredientesDeTodasAsPizzas.containsKey(ingrediente))
            ingredientesDeTodasAsPizzas.put(ingrediente, 0);
        ingredientesDeTodasAsPizzas.put(ingrediente, ingredientesDeTodasAsPizzas.get(ingrediente) + 1);
    }

    public static int quantidadeDeUmIngredienteEmTodasAsPizzas(String ingrediente) {
        return Pizza.ingredientesDeTodasAsPizzas.get(ingrediente);
    }
}
