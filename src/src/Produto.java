package src;

import java.util.Objects;

public class Produto {
    private String nome;
    private Integer codigo;
    private double preco;

    public Produto(String nome, Integer codigo, double preco){
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Produto produto = (Produto) obj;
        return codigo.equals(produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

}
