package TercerParcialClase.Ejercicios.Bridge;

public class Euros implements ITipoCambio {

    @Override
    public double applyTipoCamio(double monto) {
        return monto*10;
    }
}
