package SegundoParcialClase.chainOfResponsability.basic;

public class HandlerConcreto2 implements IHandler {
    private IHandler next; // atributo next manejador de la responsabilidad

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void criteriaHandler(int amount) {
        if(amount<1000){
            System.out.println("Tarea atendida por el HandlerConcreto2");
        }
        else{
            next.criteriaHandler(amount);
        }
    }
}
