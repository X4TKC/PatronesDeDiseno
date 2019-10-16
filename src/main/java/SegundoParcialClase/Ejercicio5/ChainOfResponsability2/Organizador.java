package SegundoParcialClase.Ejercicio5.ChainOfResponsability2;

public class Organizador implements IHandler {
    private IHandler next;


    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void criteriaHandler(String orden) {
        General handler1= new General();
        Teniente handler2= new Teniente();
        Coronel handler3= new Coronel();
        Cabo handler4= new Cabo();

        this.setNext(handler1);
        handler1.setNext(handler2);

        handler2.setNext(handler3);

        handler3.setNext(handler4);

        next.criteriaHandler(orden);



    }
}
