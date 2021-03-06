package SegundoParcialClase.chainOfResponsability.exercise;

public class Cajero implements IOperation {
    private IOperation next;
    @Override
    public void setNext(IOperation handler) {
        next=handler;
    }

    @Override
    public IOperation next() {
        return next;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        if(!persona.isPago()&& persona.isFicha()&& persona.isCertificado()){
            System.out.println("Manejado por cajero");
        }
        else{
            next.criteriaHandler(persona);
        }
    }
}
