package TercerParcialClase.Proxy.exercise;

public class Cuenta {
    private enumMoney tipo;
    private int monto;

    public enumMoney getTipo() {
        return tipo;
    }

    public void setTipo(enumMoney tipo) {
        this.tipo = tipo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }
    public Cuenta(enumMoney tipo, int monto){
        this.tipo=tipo;
        this.monto=monto;
    }
}
