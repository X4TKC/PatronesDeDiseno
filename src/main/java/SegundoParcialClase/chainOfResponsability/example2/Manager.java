package SegundoParcialClase.chainOfResponsability.example2;

public class Manager implements IOperation {
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
        if(amount==Client.Severidad.Critico){
            System.out.println("handle for Software");
        }
        else{
            next.criteriaHandler(amount);
        }
    }
}
