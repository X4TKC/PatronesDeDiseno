package SegundoParcialClase.observer.basic;

import java.util.ArrayList;

public class ConcreteSubject implements ISubject {
    private ArrayList<IObserver> observadores = new ArrayList<>();
    private String attribute1;
    public void setAttribute1(String attribute1){
        this.attribute1=attribute1;
        this.notifyObserver();
    }
    @Override
    public void attach(IObserver observer) {
        observadores.add(observer);
    }

    @Override
    public void deattah(IObserver observer) {
        observadores.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observadores.size(); i++) {
            observadores.get(i).update(attribute1);
        }
    }
}
