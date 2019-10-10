package SegundoParcialClase.chainOfResponsability.exercise;

public interface IOperation {
    void setNext(IOperation handler); // metodo para ir al siguiente encargado
    IOperation next();   //get siguiente
    void criteriaHandler(Persona persona);  // criteria para moverse en la cadena
}
