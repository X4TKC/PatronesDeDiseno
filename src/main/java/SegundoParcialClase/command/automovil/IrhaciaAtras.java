package SegundoParcialClase.command.automovil;

public class IrhaciaAtras implements IOperation {
    private Automovil automovil;

    public IrhaciaAtras(Automovil automovil){
        this.automovil=automovil;
    }
    @Override
    public void execute() {
        automovil.retroceder();
    }
}
