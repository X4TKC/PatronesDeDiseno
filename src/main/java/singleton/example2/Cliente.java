package singleton.example2;

public class Cliente {

    public static void main(String[] args){
        Persona persona1 = new Persona("persona1");
        persona1.getTimePersona();

        Persona persona2 = new Persona("persona2");
        persona2.getTimePersona();

        Persona persona3 = new Persona("persona2");
        persona3.getTimePersona();

        Persona persona4 = new Persona("persona2");
        persona4.getTimePersona();

        Persona persona5 = new Persona("persona2");
        persona5.getTimePersona();
    }
}
