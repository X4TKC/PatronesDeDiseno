package singleton.example2;

public class Persona {
    private String nombre;


    public Persona(String nombre){
        this.nombre= nombre;
    }

    public String getTimePersona(){


        return Reloj.getInstance().getTime();
    }
}
