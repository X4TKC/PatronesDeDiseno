package SegundoParcialClase.observer.basic.exerciseAutos;

public class Encargado implements IObserver {
    private String key;
    public Encargado(String key){
        this.key=key;
    }
    @Override
    public String getKey() {
        return key;
    }

    @Override
    public void update(String msg) {
        System.out.println("Encargado ");
        System.out.println("[Notificacion] "+ msg);
    }
}
