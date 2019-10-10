package SegundoParcialClase.chainOfResponsability.example;

public interface IPrestamo {

    public void setNext(IPrestamo handler); // metodo para ir al siguiente encargado
    public IPrestamo next();   //get siguiente
    public void criteriaHandler(int amount);  // criteria para moverse en la cadena
}
