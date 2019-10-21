package SegundoParcialClase.Ejercicios.ChainOfResponsability1;



public class Banco implements IHandler {
    private IHandler next;
    protected static int prestamoTotal;
    protected static int porcentajePagado=0;
    protected int prestamoPagado=0;
    public void setPorcentajePagado(){
        if(prestamoPagado>0) {
            porcentajePagado = (100 * prestamoPagado) / prestamoTotal;
        }
        else{
            porcentajePagado=0;
        }
    }
    public int getPorcentajePagado(){
        return porcentajePagado;
    }

    public int getPrestamoTotal() {
        return prestamoTotal;
    }
    public void setPrestamoPagado(int amount){
        prestamoPagado=prestamoPagado+amount;

    }
    public int getPrestamoPagado(){
        return prestamoPagado;
    }

    public void setPrestamoTotal(int prestamoTotal) {
        this.prestamoTotal = prestamoTotal;
    }

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


        Cajero handler1= new Cajero(this);
        AgenteDeCredito handler2= new AgenteDeCredito(this);
        Supervisor handler3= new Supervisor(this);
        Encargado handler4= new Encargado(this);

        this.setNext(handler1);
        handler1.setNext(handler2);

        handler2.setNext(handler3);

        handler3.setNext(handler4);

        next.criteriaHandler(amount);



    }
}
