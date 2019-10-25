package TercerParcialClase.Adapter.exercise;

public class AdapterC2 implements IBancoBs {
    private C2 c2;
    double monto=SingletonMonto.getInstance().getMonto();
    public AdapterC2(C2 c2){
        this.c2=c2;
    }

    private double cuenta;

    @Override
    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta() {
        this.cuenta =c2.getCredito()*7;
    }
    @Override
    public void Prestamo() {
        cuenta=cuenta-monto;
    }
}
