package SegundoParcialClase.observer.basic;

public interface ISubject {
    void attach(IObserver observer);
    void deattah(IObserver observer);
    void notifyObserver();
}
