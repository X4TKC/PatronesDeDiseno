package SegundoParcialClase.chainOfResponsability.basic;

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
    public void criteriaHandler(int amount) {
            HandlerConcreto1 handler1= new HandlerConcreto1();
            this.setNext(handler1);
        next.criteriaHandler(amount);
        HandlerConcreto2 handler2= new HandlerConcreto2();
        handler2.setNext(handler2);
        HandlerConcreto3 handler3= new HandlerConcreto3();
        handler3.setNext(handler3);



    }
}
