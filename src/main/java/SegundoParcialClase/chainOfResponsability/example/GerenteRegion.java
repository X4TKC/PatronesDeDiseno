package SegundoParcialClase.chainOfResponsability.example;

public class GerenteRegion implements IPrestamo {
    private IPrestamo next;
    @Override
    public void setNext(IPrestamo handler) {
        this.next=handler;
    }

    @Override
    public IPrestamo next() {
        return next;
    }

    @Override
    public void criteriaHandler(int amount) {
        if(amount>10000&&amount<50000){
            System.out.println("Tarea atendida por el Gerente region");
        }
        else{
         //   System.out.println("no puede");
                next.criteriaHandler(amount);
        }

    }
}
