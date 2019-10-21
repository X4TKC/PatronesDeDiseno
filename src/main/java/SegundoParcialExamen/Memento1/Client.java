package SegundoParcialExamen.Memento1;



public class Client {
    public static void main(String[] args) {
        CareTaker caretaker = new CareTaker(); //Almacenador de mementos
        Originator originator = new Originator(); // creador de mementos
        Document softwareProyect;

        softwareProyect = new Document("a",1);
        originator.setCommit(softwareProyect);
        caretaker.addMemento( originator.createCommit() );
        softwareProyect = (Document) softwareProyect.clone();
        softwareProyect.setVersion(2);
        originator.setCommit(softwareProyect);

        caretaker.addMemento( originator.createCommit() ); // creamos memento [0] --> State2
        softwareProyect = (Document) softwareProyect.clone();
        softwareProyect.setVersion(3);
        originator.setCommit(softwareProyect);

        caretaker.addMemento( originator.createCommit() ); // creamos memento [0] --> State2
        softwareProyect = (Document) softwareProyect.clone();
        softwareProyect.setVersion(4);
        originator.setCommit(softwareProyect);

        caretaker.addMemento( originator.createCommit() ); // creamos memento [0] --> State2


        originator.retoreFromCommit( caretaker.ctrlz() );
        originator.retoreFromCommit( caretaker.ctrlz() );
        originator.retoreFromCommit( caretaker.ctrlz() );
        originator.retoreFromCommit( caretaker.ctrly() );
        originator.retoreFromCommit( caretaker.ctrly() );
        originator.retoreFromCommit( caretaker.ctrly() );

    }
}