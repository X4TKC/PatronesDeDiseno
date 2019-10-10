package SegundoParcialClase.command.automovil;

public class DisminuirVelocidad implements IOperation {
    private Automovil automovil;

    public DisminuirVelocidad(Automovil automovil){
        this.automovil=automovil;
    }
    @Override
    public void execute() {
        automovil.desacelerar();
    }
}
