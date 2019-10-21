package SegundoParcialClase.Ejercicios.ChainOfResponsability1;


public class Client {

    public static void main (String[] args){
        Banco banco = new Banco();
        banco.setPrestamoTotal(100);
        banco.criteriaHandler(25);
        banco.criteriaHandler(26);
        banco.criteriaHandler(26);
        banco.criteriaHandler(23);
        banco.criteriaHandler(0);


    }
}
