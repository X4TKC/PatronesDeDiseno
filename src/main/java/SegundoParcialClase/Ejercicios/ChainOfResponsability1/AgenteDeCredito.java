package SegundoParcialClase.Ejercicios.ChainOfResponsability1;

public class AgenteDeCredito implements IHandler {
    private IHandler next;
    private Banco banco;


    public AgenteDeCredito(Banco banco){
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
        if(banco.getPorcentajePagado()>=25&&banco.getPorcentajePagado()<=50){
            banco.setPrestamoPagado(amount);
            System.out.println("Pago realizado por el Agente de Credito");
            System.out.println("Se ofrecera refinanciar el prestamo");;
        }
        else{
            next.criteriaHandler(amount);
        }

    }
}
