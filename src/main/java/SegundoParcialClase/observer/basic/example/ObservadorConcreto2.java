package SegundoParcialClase.observer.basic.example;

public class ObservadorConcreto2 implements IObserver {
    private String key;
    public ObservadorConcreto2(String key){
        this.key=key;
    }
    public String getKey(){
        return key;
    }
    @Override
    public void update(String msg) {
        System.out.println("Observador 2 ");
        System.out.println("[Notificacion] "+ msg);
    }
}
