package SegundoParcialClase.chainOfResponsability.example2;

public class QA implements IOperation {
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

        if(amount==Client.Severidad.Bajo){
            System.out.println("handle for QA");
        }
        else{
            next.criteriaHandler(amount);
        }
    }
}
