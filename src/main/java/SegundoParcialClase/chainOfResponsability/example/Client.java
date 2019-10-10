package SegundoParcialClase.chainOfResponsability.example;

public class Client {

    public static void main (String[] args){
        Banco banco = new Banco();
        banco.criteriaHandler(100);
       banco.criteriaHandler(1001);
       banco.criteriaHandler(10001);
       banco.criteriaHandler(50001);
       banco.criteriaHandler(2000000);
    }
}
