package SegundoParcialClase.Ejercicios.ChainOfResponsability1;

public class Encargado implements IHandler {
    private IHandler next;
    private Banco banco;


    public Encargado(Banco banco){
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

        if(banco.getPrestamoPagado()==banco.getPrestamoTotal()){
            banco.setPrestamoPagado(amount);
            System.out.println("Manejado por el encargado");
            System.out.println("Devolviendo todos los documentos");
        }
        else{
            System.out.println("Error");
        }
    }
}
