package SegundoParcialClase.Ejercicio5.Command3;

public class Renombrar implements IOperation {
    private Archivo archivo;

    public Renombrar(Archivo arch){
        this.archivo=arch;
    }
    @Override
    public void execute() {
        archivo.renombrar();
    }
}
