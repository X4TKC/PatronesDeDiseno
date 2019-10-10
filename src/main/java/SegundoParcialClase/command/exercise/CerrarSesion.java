package SegundoParcialClase.command.exercise;

public class CerrarSesion implements IOperation {
    private Computadora computadora;

    public CerrarSesion(Computadora computadora){
        this.computadora=computadora;
    }


    @Override
    public void execute(String user) {
        computadora.cerrarSesion(user);
    }
}
