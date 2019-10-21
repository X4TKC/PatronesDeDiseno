package SegundoParcialExamen.State5;

public class Reiniciar implements IState {
    private Computadora computadora;
    public Reiniciar(Computadora computadora){
        this.computadora=computadora;
    }
    @Override
    public void handle() {
        computadora.setConsumoCPU("0%");
        computadora.setConsumoRAM("0%");
        String[] var = {"Cerrados"};
        computadora.setProgramasAbiertos(var);

    }
}
