package SegundoParcialClase.chainOfResponsability.example;

public class Banco implements IPrestamo {
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
        AgenteCredito handler1= new AgenteCredito();
        GerenteSucursal handler2= new GerenteSucursal();
        GerenteRegion handler3= new GerenteRegion();
        GerenteGeneral handler4 = new GerenteGeneral();
        this.setNext(handler1);
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        handler3.setNext(handler4);
        next.criteriaHandler(amount);





    }
}
