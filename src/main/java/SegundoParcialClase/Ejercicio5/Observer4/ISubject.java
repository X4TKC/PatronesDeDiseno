package SegundoParcialClase.Ejercicio5.Observer4;

public interface ISubject {
    void attach(IObserver observer);
    void deattach(IObserver observer);
    void notifyObserver();
}
