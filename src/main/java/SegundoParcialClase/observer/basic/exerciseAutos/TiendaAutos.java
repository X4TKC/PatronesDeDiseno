package SegundoParcialClase.observer.basic.exerciseAutos;

import java.util.HashMap;

public class TiendaAutos implements ISubject {
    private HashMap<String, IObserver> observadores = new HashMap();
    private Auto auto;

    public void setAttribute1(Auto attribute1){
        this.auto=attribute1;
        if(auto.getEstado().equals("Mal estado")){
        this.notifyObserver();
        }
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

        for (String key: observadores.keySet()) {

                observadores.get(key).update(auto.getEstado());


        }
    }
}
