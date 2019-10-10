package SegundoParcialClase.chainOfResponsability.basic;

public interface IHandler {

    public void setNext(IHandler handler); // metodo para ir al siguiente encargado
    public IHandler next();   //get siguiente
    public void criteriaHandler(int amount);  // criteria para moverse en la cadena
}
