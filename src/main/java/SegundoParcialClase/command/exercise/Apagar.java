package SegundoParcialClase.command.exercise;

public class Apagar implements IOperation {
    private Computadora computadora;

    public Apagar(Computadora computadora){
        this.computadora=computadora;
    }


    @Override
    public void execute(String user) {
        computadora.apagar(user);
    }
}
