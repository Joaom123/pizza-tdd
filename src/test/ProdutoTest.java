package test;

import src.Produto;
import org.junit.*;
import static org.junit.Assert.*;

import java.util.Currency;

public class ProdutoTest {
    Produto produto1;
    Produto produto2;

    @Before
    public void inicializa() {
    }

    @Test
    public void doisProdutosComMesmoCodigoSaoIguais() {
        produto1 = new Produto("Caixa", 111, 24.99);
        produto2 = new Produto("Caixa", 111, 24.99);

        assertEquals(produto1, produto2);
    }

    @Test
    public void doisProdutosComCodigosDiferentesNaoSaoIguais() {
        produto1 = new Produto("Caixa", 111, 24.99);
        produto2 = new Produto("Caixa", 222, 24.99);

        assertNotEquals(produto1, produto2);
    }
}
