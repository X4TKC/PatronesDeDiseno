package SegundoParcialClase.memento.basic;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento> savedStates = new ArrayList<Memento>();

    public void addMemento(Memento m) {
        savedStates.add(m);
    }

    public Memento getMemento(int index) {
        return savedStates.get(index);
    }
}