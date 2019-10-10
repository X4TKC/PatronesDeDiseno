package SegundoParcialClase.chainOfResponsability.exercise;

public class Notario implements IOperation {
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
        if(persona.isPago()&& persona.isFicha()&&!persona.isCertificado()){
            System.out.println("Manejado por Notario");
        }
        else{
            next.criteriaHandler(persona);
        }
    }
}
