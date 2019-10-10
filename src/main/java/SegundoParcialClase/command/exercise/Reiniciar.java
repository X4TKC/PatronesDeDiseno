package SegundoParcialClase.command.exercise;

public class Reiniciar implements IOperation {
    private Computadora computadora;

    public Reiniciar(Computadora computadora){
        this.computadora=computadora;
    }


    @Override
    public void execute(String user) {
        computadora.reiniciar(user);
    }
}
