package SegundoParcialClase.chainOfResponsability.example;

public class GerenteSucursal implements IPrestamo {
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
        if(amount>1000&&amount<10000){
            System.out.println("Tarea atendida por el Gerente Sucursal");
        }
        else{

            next.criteriaHandler(amount);


                }

    }
}
