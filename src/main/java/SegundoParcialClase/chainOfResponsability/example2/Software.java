package SegundoParcialClase.chainOfResponsability.example2;

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
    public void criteriaHandler(Client.Severidad amount) {
        Soporte handler1= new Soporte();
        QA handler2= new QA();
        DEV handler3= new DEV();
        Manager handler4 = new Manager();
        this.setNext(handler1);
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler3.setNext(handler4);
        next.criteriaHandler(amount);

    }
}
