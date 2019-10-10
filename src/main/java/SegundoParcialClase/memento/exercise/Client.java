package SegundoParcialClase.memento.exercise;

import java.util.Random;

public class Client {
    public static void main(String[] args) {
        CareTaker caretaker = new CareTaker(); //Almacenador de mementos
        Originator originator = new Originator(); // creador de mementos
        SoftwareProyect softwareProyect;

        softwareProyect = new SoftwareProyect("nuevo mensaje","codigo1","Kevin");
        originator.setCommit(softwareProyect);

        softwareProyect = (SoftwareProyect) softwareProyect.clone();
        softwareProyect.setCode("codigo2");
        originator.setCommit(softwareProyect);

        caretaker.addMemento( originator.createCommit() ); // creamos memento [0] --> State2

        softwareProyect = (SoftwareProyect) softwareProyect.clone();
        softwareProyect.setCode("codigo3");
        originator.setCommit(softwareProyect);

        caretaker.addMemento( originator.createCommit() ); // creamos memento [1] --> State3

        softwareProyect = (SoftwareProyect) softwareProyect.clone();
        softwareProyect.setCode("codigo4");
        originator.setCommit(softwareProyect);
        caretaker.addMemento( originator.createCommit() );
        softwareProyect = (SoftwareProyect) softwareProyect.clone();
        softwareProyect.setCode("codigo5");
        Random rn = new Random();
        int ans = rn.nextInt(1000) + 1;
        softwareProyect.setVersion(ans);
        originator.setCommit(softwareProyect);
        caretaker.addMemento( originator.createCommit() );
        softwareProyect = (SoftwareProyect) softwareProyect.clone();
        softwareProyect.setCode("codigo6");
        originator.setCommit(softwareProyect);
        caretaker.addMemento( originator.createCommit() );
        softwareProyect = (SoftwareProyect) softwareProyect.clone();
        softwareProyect.setCode("codigo7");
        originator.setCommit(softwareProyect);
        caretaker.addMemento( originator.createCommit() );
        softwareProyect = (SoftwareProyect) softwareProyect.clone();
        softwareProyect.setCode("codigo8");
        originator.setCommit(softwareProyect);
        caretaker.addMemento( originator.createCommit() );
        softwareProyect = (SoftwareProyect) softwareProyect.clone();
        softwareProyect.setCode("codigo9");
        originator.setCommit(softwareProyect);
        caretaker.addMemento( originator.createCommit() );
        softwareProyect = (SoftwareProyect) softwareProyect.clone();
        softwareProyect.setCode("codigo10");
        originator.setCommit(softwareProyect);
        caretaker.addMemento( originator.createCommit() );

        originator.retoreFromCommit( caretaker.getMemento(ans) );
    }
}