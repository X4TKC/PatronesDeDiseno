package SegundoParcialClase.Ejercicio5.Command3;

public class Mover implements IOperation {
    private Archivo archivo;

    public Mover(Archivo arch){
        this.archivo=arch;
    }
    @Override
    public void execute() {
        archivo.mover();
    }
}
