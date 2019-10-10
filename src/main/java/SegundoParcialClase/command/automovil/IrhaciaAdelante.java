package SegundoParcialClase.command.automovil;

public class IrhaciaAdelante implements  IOperation{
    private Automovil automovil;

    public IrhaciaAdelante(Automovil automovil){
        this.automovil=automovil;
    }
    @Override
    public void execute() {
        automovil.avanzar();
    }
}
