package SegundoParcialClase.observer.basic.exerciseAutos;

public class Client {
    public static void main(String[] args){
        TiendaAutos tiendaAutos = new TiendaAutos();
        tiendaAutos.attach(new Ventas("Ventas"));
        tiendaAutos.attach(new Encargado("Encargado"));
        tiendaAutos.attach(new Reparaciones("Reparaciones"));
        tiendaAutos.setAttribute1(new Auto("buen estado"));
        //tiendaAutos.notifyObserver();
//        ConcreteSubject object = new ConcreteSubject();
//        object.attach(new ObservadorConcreto1());
//        object.attach(new ObservadorConcreto2());
//
//        object.setAttribute1("message");
//        object.notifyObserver();
    }
}
