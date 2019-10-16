package SegundoParcialClase.Ejercicio5.Command3;

public class Copiar implements IOperation {
    private Archivo archivo;

    public Copiar(Archivo arch){
        this.archivo=arch;
    }
    @Override
    public void execute() {
        archivo.copiar();
    }
}
