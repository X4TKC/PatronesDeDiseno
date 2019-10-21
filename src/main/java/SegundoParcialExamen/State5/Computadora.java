package SegundoParcialExamen.State5;

public class Computadora {

    private String[] programasAbiertos;
    private String consumoRAM;
    private String consumoCPU;

    public String[] getProgramasAbiertos() {
        return programasAbiertos;
    }

    public void setProgramasAbiertos(String[] programasAbiertos) {
        this.programasAbiertos = programasAbiertos;
    }

    public String getConsumoRAM() {
        return consumoRAM;
    }

    public void setConsumoRAM(String consumoRAM) {
        this.consumoRAM = consumoRAM;
    }

    public String getConsumoCPU() {
        return consumoCPU;
    }

    public void setConsumoCPU(String consumoCPU) {
        this.consumoCPU = consumoCPU;
    }

    private IState state; // requisto --- > attribute interface state

    public void setState( IState state )
    {
        this.state = state;
    }

    public IState getState()
    {
        return state;
    }

    public void request()
    {
        state.handle();
    }
}
