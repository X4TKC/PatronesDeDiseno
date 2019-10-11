package SegundoParcialClase.observer.basic.exerciseAutos;

public interface ISubject {
    void attach(IObserver observer);
    void deattach(IObserver observer);
    void notifyObserver();
}
