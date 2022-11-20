package moedas;

public class Dinheiro {
    IPreco preco;
    PrecoAdapter persistencia;

    public Dinheiro() {
        preco = new PrecoDolar();
        persistencia = new PrecoAdapter(preco);
    }

    public void setPreco(float dolar) {
        preco.setPreco(dolar);
        persistencia.DolarParaReal();
    }

    public float getPreco() {
        return persistencia.RealParaDolar();
    }

    public float getReal() {
        return persistencia.getPreco();
    }
}
