package TercerParcialClase.Ejercicios.Proxy;

public class Servidor implements IServidor {

    private String archivo;
    private enumTipo tipo;
    public Servidor(){

    }


    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public enumTipo getTipo() {
        return tipo;
    }

    public void setTipo(enumTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void descarga() {
        System.out.println("Archivo : "+ archivo+", de tipo : "+ tipo);
    }

    @Override
    public void carga(String archivo, enumTipo tipo) {
        this.archivo=archivo;
        this.tipo=tipo;
        System.out.println("Archivo cargado : "+ archivo+", de tipo : "+ tipo);
    }
}