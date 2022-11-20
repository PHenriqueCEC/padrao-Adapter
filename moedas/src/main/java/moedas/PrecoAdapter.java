package moedas;

public class PrecoAdapter extends PrecoReal {
    private IPreco precoDolar;

    public PrecoAdapter(IPreco precoDolar) {
        this.precoDolar = precoDolar;
    }

    public float RealParaDolar(){
        precoDolar.setPreco((this.getPreco() / 5));
        return precoDolar.getPreco();
    }

    public void DolarParaReal(){
        this.setPreco((precoDolar.getPreco() * 5));
    }
}
