package SegundoParcialClase.chainOfResponsability.example2;

public class Client {
    public static void main(String[] args){
        Software software = new Software();
        software.criteriaHandler(Severidad.Critico);
        software.criteriaHandler(Severidad.Medio);
        software.criteriaHandler(Severidad.Bajo);
        software.criteriaHandler(Severidad.Estetico);

    }


     enum Severidad{
        Critico, Medio, Bajo, Estetico
    }
}
