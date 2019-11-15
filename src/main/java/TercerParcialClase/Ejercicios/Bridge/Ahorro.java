package TercerParcialClase.Ejercicios.Bridge;

public class Ahorro implements ICuentas {
    private ITipoCambio tipoCambio;
    private double monto;
    public Ahorro(ITipoCambio tipoCambio, double monto){
        this.tipoCambio=tipoCambio;
        this.monto=tipoCambio.applyTipoCamio(monto);
    }
    @Override
    public void processAccount() {
        setMonto(monto+(monto*0.02));
        System.out.println("Interes aumentado en un 2% :"+ monto);
    }

    @Override
    public double getMonto() {
        return monto;
    }

    @Override
    public void setMonto(double monto) {
        this.monto=monto;
    }
}
