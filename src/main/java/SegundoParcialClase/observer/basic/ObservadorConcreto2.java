package SegundoParcialClase.observer.basic;

public class ObservadorConcreto2 implements  IObserver {
    @Override
    public void update(String msg) {
        System.out.println("Observador 2 ");
        System.out.println("[Notificacion] "+ msg);
    }
}
