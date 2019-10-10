package SegundoParcialClase.chainOfResponsability.example;

public class GerenteGeneral implements IPrestamo {
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
        if(amount>50000&&amount<100000){
            System.out.println("Tarea atendida por el Gerente general");
        }
        else{


        }

    }
}
