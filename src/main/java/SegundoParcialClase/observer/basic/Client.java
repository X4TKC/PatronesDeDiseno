package SegundoParcialClase.observer.basic;

public class Client {
    public static void main(String[] args){
        ConcreteSubject object = new ConcreteSubject();
        object.attach(new ObservadorConcreto1());
        object.attach(new ObservadorConcreto2());

        object.setAttribute1("message");
        object.notifyObserver();
    }
}
