package SegundoParcialClase.chainOfResponsability.exercise;


public class Client {
    public static void main(String[] args){
        Software software = new Software();
        Persona per1 = new Persona();
        Persona per2 = new Persona(true,false,true);
        Persona per3 = new Persona(false,false,true);
        Persona per4 = new Persona(false,true,true);
        Persona per5 = new Persona(true,true,true);

        software.criteriaHandler(per1);
        software.criteriaHandler(per2);
        software.criteriaHandler(per3);
        software.criteriaHandler(per4);
        software.criteriaHandler(per5);

    }



}
