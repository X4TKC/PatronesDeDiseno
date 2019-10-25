package TercerParcialClase.Adapter.exercise;

public class BancoSol implements IBancoBs {
    private double cuenta;
    double monto=SingletonMonto.getInstance().getMonto();



    @Override
    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void Prestamo() {
        cuenta=cuenta-monto;
    }
}
