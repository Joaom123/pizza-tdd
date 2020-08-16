package src;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    public List<String> ingredientes;

    public Pizza() {
        ingredientes = new ArrayList<String>();
    }

    public void adicionaIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    public int getPreco() {
        int quantidadeDeIngredientes = ingredientes.size();

        if(quantidadeDeIngredientes < 3)
            return 15;
        return ingredientes.size();
    }
}
