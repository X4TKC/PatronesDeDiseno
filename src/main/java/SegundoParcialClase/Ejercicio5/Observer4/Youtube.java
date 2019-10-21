package SegundoParcialClase.Ejercicio5.Observer4;

import java.util.HashMap;

public class Youtube implements ISubject {
    private HashMap<enumCategoria, IObserver> observadores = new HashMap();
    private Video video;
    public void setAttribute1(Video attribute1){
        this.video=attribute1;
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

        for (enumCategoria key: observadores.keySet()) {
            if(((Persona)observadores.get(key)).getPreferencia()==video.getCategoria()||
                    ((Persona)observadores.get(key)).getPreferencia()==enumCategoria.anyCategory){
                observadores.get(key).update(video.getTitulo());
            }



        }
    }
}
