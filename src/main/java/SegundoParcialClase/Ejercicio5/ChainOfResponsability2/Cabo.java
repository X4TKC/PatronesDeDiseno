package SegundoParcialClase.Ejercicio5.ChainOfResponsability2;

public class Cabo implements IHandler {
    private IHandler next; // atributo next manejador de la responsabilidad

    @Override
    public void setNext(IHandler handler) {
        next=handler;
    }

    @Override
    public IHandler next() {
        return next;
    }

    @Override
    public void criteriaHandler(String orden) {
        if(orden.equals("Limpiezas")){
            System.out.println("Tarea atendida por el Cabo");
        }
        else{
            System.out.println("Tarea no asignada");
        }
    }
}
