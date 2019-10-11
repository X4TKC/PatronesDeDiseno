package SegundoParcialClase.observer.basic.example;

public class ObservadorConcreto1 implements IObserver {
    private String key;
    public ObservadorConcreto1(String key){
            this.key=key;
    }
    public String getKey(){
        return key;
    }
    @Override
    public void update(String msg) {
        System.out.println("Observador 1 ");
        System.out.println("[Notificacion] "+ msg);
    }
}
