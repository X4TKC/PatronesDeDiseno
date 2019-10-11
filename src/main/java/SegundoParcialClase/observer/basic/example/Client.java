package SegundoParcialClase.observer.basic.example;

public class Client {
    public static void main(String[] args){
        ConcreteSubject object = new ConcreteSubject();
        object.attach(new ObservadorConcreto1("ObservadorConcreto1"));
        object.attach(new ObservadorConcreto2("ObservadorConcreto2"));

        object.setAttribute1("message");
        object.notifyObserver();
    }
}
