package SegundoParcialClase.chainOfResponsability.example;

public class AgenteCredito implements IPrestamo {
    private IPrestamo next;
    @Override
    public void setNext(IPrestamo handler) {
            next=handler;
    }

    @Override
    public IPrestamo next() {
        return next;
    }

    @Override
    public void criteriaHandler(int amount) {
        if(amount<=1000){
            System.out.println("Tarea atendida por el Agente de credito");
        }
        else{
            next.criteriaHandler(amount);
        }
    }
}
