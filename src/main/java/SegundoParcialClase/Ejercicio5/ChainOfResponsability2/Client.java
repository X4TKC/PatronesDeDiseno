package SegundoParcialClase.Ejercicio5.ChainOfResponsability2;

public class Client {

    public static void main (String[] args){
        Organizador organizador = new Organizador();
        organizador.criteriaHandler("Disciplina");
        organizador.criteriaHandler("Desbloqueos");
        organizador.criteriaHandler("Manifestaciones");
        organizador.criteriaHandler("Limpiezas");
        organizador.criteriaHandler("Entrevistas");
        organizador.criteriaHandler("asd");
    }
}
