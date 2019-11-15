package TercerParcialClase.Ejercicios.Bridge;

public class Bolivianos implements ITipoCambio {
    @Override
    public double applyTipoCamio(double monto) {
        return monto;
    }
}
