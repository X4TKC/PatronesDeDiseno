package TercerParcialClase.Ejercicios.Bridge;

public class Credito implements ICuentas {
    private ITipoCambio tipoCambio;
    private double monto;
    public Credito(ITipoCambio tipoCambio, double monto){
        this.tipoCambio=tipoCambio;
        this.monto=tipoCambio.applyTipoCamio(monto);
    }
    @Override
    public void processAccount() {
        System.out.println("Monto no alterado");
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
