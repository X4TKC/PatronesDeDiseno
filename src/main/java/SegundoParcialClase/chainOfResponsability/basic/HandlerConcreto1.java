package SegundoParcialClase.chainOfResponsability.basic;

public class HandlerConcreto1 implements IHandler {
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
        if(amount<100){
            System.out.println("Tarea atendida por el Handler1");
        }
        else{
            next.criteriaHandler(amount);
        }
    }
}
