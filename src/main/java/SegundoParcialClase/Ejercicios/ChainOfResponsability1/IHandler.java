package SegundoParcialClase.Ejercicios.ChainOfResponsability1;

public interface IHandler {

     void setNext(IHandler handler); // metodo para ir al siguiente encargado
     IHandler next();   //get siguiente
     void criteriaHandler(int amount);  // criteria para moverse en la cadena
}
