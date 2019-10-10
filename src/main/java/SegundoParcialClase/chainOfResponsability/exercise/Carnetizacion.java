package SegundoParcialClase.chainOfResponsability.exercise;

public class Carnetizacion implements IOperation {
    private IOperation next;
    @Override
    public void setNext(IOperation handler) {
        next = handler;
    }

    @Override
    public IOperation next() {
        return next;
    }

    @Override
    public void criteriaHandler(Persona persona) {
        if(persona.isCertificado()&& persona.isFicha()&& persona.isPago()){
            System.out.println("Manejado por carnetizacion");
        }
        else{
            next.criteriaHandler(persona);
        }
    }
}
