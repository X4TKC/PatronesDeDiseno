package SegundoParcialClase.memento.exercise;

import java.util.ArrayList;

public class CareTaker {
    private ArrayList<Memento> savedStates = new ArrayList<>();

    public void addMemento(Memento m) {
        savedStates.add(m);
    }

    public Memento getMemento(int version) {
        for (int i = 0; i < savedStates.size(); i++) {
            if(savedStates.get(i).getSavedState().getVersion()==version){
                return savedStates.get(i);
            }
        }
        return savedStates.get(savedStates.size()-1);

    }
}