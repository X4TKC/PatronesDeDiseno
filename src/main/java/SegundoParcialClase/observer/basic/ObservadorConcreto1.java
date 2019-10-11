package SegundoParcialClase.observer.basic;

public class ObservadorConcreto1 implements  IObserver {
    @Override
    public void update(String msg) {
        System.out.println("Observador 1 ");
        System.out.println("[Notificacion] "+ msg);
    }
}
