package SegundoParcialExamen.Observer4;

import java.util.ArrayList;
import java.util.HashMap;

public class CompaniaTelefonica implements ISubject {
    private HashMap<ArrayList<enumCategoria>, IObserver> observadores = new HashMap<>();
    private Notificacion notificaciones;
    
    public void setAttribute1(Notificacion attribute1){
        this.notificaciones=attribute1;
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
        for (ArrayList<enumCategoria> key: observadores.keySet()) {

                if(!(((Persona)observadores.get(key)).getPreferencia().contains(notificaciones.getCategoria()))&&
                        !(((Persona)observadores.get(key)).getPreferencia().contains(enumCategoria.Ninguna))){
                    observadores.get(key).update(notificaciones.getTitulo());
                }

//            if(!(((Persona)observadores.get(key)).getPreferencia() == notificaciones.getCategoria()) && !(((Persona)observadores.get(key)).getPreferencia() == enumCategoria.Ninguna)) {
//
//            }
        }
    }
}
