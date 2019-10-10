package SegundoParcialClase.chainOfResponsability.basic;

public class Client {

    public static void main (String[] args){
        Organizador organizador = new Organizador();
        organizador.criteriaHandler(120);
    }
}
