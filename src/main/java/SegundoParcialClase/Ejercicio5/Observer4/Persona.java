package SegundoParcialClase.Ejercicio5.Observer4;

public class Persona implements IObserver {
    private enumCategoria preferencia;
    private String name;

    public Persona(enumCategoria preferencia, String name){
        this.preferencia=preferencia;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public enumCategoria getPreferencia() {
        return preferencia;
    }

    public void setPreferencia(enumCategoria preferencia) {
        this.preferencia = preferencia;
    }

    @Override
    public enumCategoria getKey() {
        return preferencia;
    }

    @Override
    public void update(String msg) {
            System.out.println("Usuario: "+ name+" preferencia: "+preferencia+" se agrego el video "+ msg);
    }
}
