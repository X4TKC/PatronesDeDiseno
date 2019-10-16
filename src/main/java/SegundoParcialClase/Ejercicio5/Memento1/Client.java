package SegundoParcialClase.Ejercicio5.Memento1;

public class Client {

    public static void main(String[] args){
        CareTaker caretaker = new CareTaker(); //Almacenador de mementos
        Originator originator = new Originator();
        Tesis tesis;
        Tesis tesis2;
        Tesis tesis3;
        Tesis tesis4;
        Tesis tesis5;


        tesis = new Tesis(1);
        originator.crearBackup(tesis);
        caretaker.addMemento(originator.createMemento());

        tesis2 = (Tesis) tesis.clone();
        tesis2.setVersion(2);
        originator.crearBackup(tesis2);
        caretaker.addMemento(originator.createMemento());

        tesis3 = (Tesis) tesis2.clone();
        tesis3.setVersion(3);
        originator.crearBackup(tesis3);
        caretaker.addMemento(originator.createMemento());
        tesis4 = (Tesis) tesis3.clone();
        tesis4.setVersion(4);
        originator.crearBackup(tesis4);
        caretaker.addMemento(originator.createMemento());

        tesis5 = (Tesis) tesis4.clone();
        tesis5.setVersion(5);
        originator.crearBackup(tesis5);
        caretaker.addMemento(originator.createMemento());

        originator.restoreFromBD( caretaker.getMemento(3) );
    }
}
