package SegundoParcialClase.command.exercise;

public class Suspender implements IOperation {


    private Computadora computadora;

    public Suspender(Computadora computadora){
        this.computadora=computadora;
    }


    @Override
    public void execute(String user) {
        computadora.suspender(user);
    }
}
