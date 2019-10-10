package SegundoParcialClase.chainOfResponsability.exercise;

public class AyudaAlCliente implements IOperation {
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

            System.out.println("Manejado por Ayuda al cliente");


    }
}
