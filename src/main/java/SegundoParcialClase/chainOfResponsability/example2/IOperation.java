package SegundoParcialClase.chainOfResponsability.example2;

public interface IOperation {
     void setNext(IOperation handler); // metodo para ir al siguiente encargado
     IOperation next();   //get siguiente
     void criteriaHandler(Client.Severidad amount);  // criteria para moverse en la cadena
}
