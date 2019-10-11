package SegundoParcialClase.observer.basic.exerciseAutos;

public class Ventas implements IObserver {
    private String key;
    public Ventas(String key){
        this.key=key;
    }
    @Override
    public String getKey() {
        return key;
    }

    @Override
    public void update(String msg) {
        System.out.println("Ventas ");
        System.out.println("[Notificacion] "+ msg);
    }
}
