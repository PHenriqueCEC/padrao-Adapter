package moedas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrecoTest {

    @Test
    void deveRetornarValorEmDolar() {
        Dinheiro dinheiro = new Dinheiro();
        dinheiro.setPreco(15);

        assertEquals(15, dinheiro.getPreco());
    }

    @Test
    void deveRetornarValorEmReal() {
        Dinheiro dinheiro = new Dinheiro();
        dinheiro.setPreco(15);

        assertEquals(75, dinheiro.getReal());
    }
}
