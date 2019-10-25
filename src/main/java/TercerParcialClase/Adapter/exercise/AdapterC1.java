package TercerParcialClase.Adapter.exercise;

public class AdapterC1 implements IBancoBs {
    private C1 c1;
    double monto=SingletonMonto.getInstance().getMonto();
    public AdapterC1(C1 c1){
        this.c1=c1;
    }
    private double cuenta;



    @Override
    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta() {
        this.cuenta =c1.getCredito()*7;
    }
    @Override
    public void Prestamo() {
        cuenta=cuenta-monto;
    }
}
