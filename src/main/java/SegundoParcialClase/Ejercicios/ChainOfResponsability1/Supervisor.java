package SegundoParcialClase.Ejercicios.ChainOfResponsability1;

public class Supervisor implements IHandler {
    private IHandler next;
    private Banco banco;


    public Supervisor(Banco banco){
        this.banco=banco;
    }
    @Override
    public void setNext(IHandler handler) {
        this.next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void criteriaHandler(int amount) {

        banco.setPorcentajePagado();
        if(banco.getPorcentajePagado()>50&&banco.getPrestamoTotal()!=banco.getPrestamoPagado()){
            banco.setPrestamoPagado(amount);
            System.out.println("Pago realizado por el Supervisor");
            System.out.println("Se ofrecera nuevos prestamos");
        }
        else{
            next.criteriaHandler(amount);
        }
    }
}
