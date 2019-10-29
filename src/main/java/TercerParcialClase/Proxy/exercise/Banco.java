package TercerParcialClase.Proxy.exercise;

public class Banco implements IBanco {
    private Cuenta cuentaactual;
    public Banco(Cuenta cuenta){
        cuentaactual=cuenta;
    }
    @Override
    public void request() {
        depositar(cuentaactual.getTipo(),cuentaactual.getMonto());
    }
    public void depositar(enumMoney tipo, int monto){
        cuentaactual.setTipo(tipo);
        cuentaactual.setMonto(monto);
        System.out.println("Se realizo el deposito en "+cuentaactual.getTipo()+" con el monto "+cuentaactual.getMonto());
    }
}
