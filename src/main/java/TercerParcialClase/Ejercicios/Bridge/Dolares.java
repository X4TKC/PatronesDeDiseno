package TercerParcialClase.Ejercicios.Bridge;

public class Dolares implements ITipoCambio {

    @Override
    public double applyTipoCamio(double monto) {
        return monto*7;
    }
}
