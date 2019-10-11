package SegundoParcialClase.observer.basic.exerciseAutos;

public class Reparaciones implements IObserver {
    private String key;
    public Reparaciones(String key){
        this.key=key;
    }
    @Override
    public String getKey() {
        return key;
    }

    @Override
    public void update(String msg) {
        System.out.println("Reparaciones ");
        System.out.println("[Notificacion] "+ msg);
    }
}
