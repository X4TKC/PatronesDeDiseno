package SegundoParcialClase.chainOfResponsability.basic;

public class HandlerConcreto3 implements IHandler {
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
        if(amount<10000){
            System.out.println("Tarea atendida por el Handler3");
        }
        else{
            System.out.println("no puede");
        }
    }
}
