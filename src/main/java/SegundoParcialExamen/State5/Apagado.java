package SegundoParcialExamen.State5;

public class Apagado implements IState {
    private Computadora computadora;
    public Apagado(Computadora computadora){
        this.computadora=computadora;
    }
    @Override
    public void handle() {
        computadora.setConsumoCPU("minimo");
        computadora.setConsumoRAM("minimo");
        String[] var={0+""};
        computadora.setProgramasAbiertos(var);

    }
}
