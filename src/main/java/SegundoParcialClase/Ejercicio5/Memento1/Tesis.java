package SegundoParcialClase.Ejercicio5.Memento1;

public class Tesis implements ITesis {

    private int version;

    public Tesis(int ver){
        version=ver;
    }
    public void show() {
        System.out.println("Current values --> Version: " + version);
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public Object clone() {
        Tesis cloneObj = new Tesis(version);

        return cloneObj;
    }
}
