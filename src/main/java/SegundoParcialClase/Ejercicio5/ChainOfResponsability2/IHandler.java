package SegundoParcialClase.Ejercicio5.ChainOfResponsability2;

public interface IHandler {

     void setNext(IHandler handler); // metodo para ir al siguiente encargado
     IHandler next();   //get siguiente
     void criteriaHandler(String amount);  // criteria para moverse en la cadena
}
