package SegundoParcialClase.memento.basic;

public class Client {
    public static void main(String[] args) {
        CareTaker caretaker = new CareTaker(); //Almacenador de mementos
        Originator originator = new Originator(); // creador de mementos
        ConcreteObject concreteObject;

        concreteObject = new ConcreteObject("Juegos","State1");
        originator.setMemento(concreteObject);

        concreteObject = new ConcreteObject("Juegos","State2");
        originator.setMemento(concreteObject);

        caretaker.addMemento( originator.createMemento() ); // creamos memento [0] --> State2

        concreteObject = new ConcreteObject("Juegos","State3");
        originator.setMemento(concreteObject);

        caretaker.addMemento( originator.createMemento() ); // creamos memento [1] --> State3

        concreteObject = new ConcreteObject("Juegos","State4");
        originator.setMemento(concreteObject);

        originator.restoreFromMemento( caretaker.getMemento(1) );
    }
}