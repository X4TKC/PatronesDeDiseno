package SegundoParcialClase.chainOfResponsability.exercise;

public class Software implements IOperation {
    private IOperation next;
    @Override
    public void setNext(IOperation handler) {
        next=handler;
    }

    @Override
    public IOperation next() {
        return next;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        Carnetizacion handler1= new Carnetizacion();
        Notario handler2= new Notario();
        Cajero handler3 = new Cajero();
        AyudaAlCliente handler4= new AyudaAlCliente();

        this.setNext(handler1);
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler3.setNext(handler4);
        next.criteriaHandler(persona);

    }
}
