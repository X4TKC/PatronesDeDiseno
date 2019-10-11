package SegundoParcialClase.observer.basic.example;

import java.util.ArrayList;
import java.util.HashMap;

public class ConcreteSubject implements ISubject {
    private HashMap<String, IObserver> observadores = new HashMap();
    private String attribute1;

    public void setAttribute1(String attribute1){
        this.attribute1=attribute1;
        this.notifyObserver();
    }
    @Override
    public void attach(IObserver observer) {
        observadores.put(observer.getKey(),observer);
    }

    @Override
    public void deattach(IObserver observer) {


        observadores.remove(observer.getKey());
    }

    @Override
    public void notifyObserver() {
//        for (int i = 0; i < observadores.size(); i++) {
//            observadores.get(i).update(attribute1);
//        }
        for (String key: observadores.keySet()) {
            observadores.get(key).update(attribute1);
        }
    }
}
