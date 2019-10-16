package SegundoParcialClase.Ejercicio5.Command3;

public class Crear implements IOperation {
    private Archivo archivo;

    public Crear(Archivo arch){
        this.archivo=arch;
    }
    @Override
    public void execute() {
        archivo.crear();
    }
}
