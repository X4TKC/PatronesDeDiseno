package SegundoParcialClase.command.automovil;

public class AumentarVelocidad implements IOperation {
    private Automovil automovil;

    public AumentarVelocidad(Automovil automovil){
        this.automovil=automovil;
    }
    @Override
    public void execute() {
        automovil.acelerar();
    }
}
