package KitEscolarEjercicio;

public class Kit_escolar implements Kit {


    private Mochila Mochila;
    private Deportivo Deportivo;
    private Cuaderno Cuadernos;


    public KitEscolarEjercicio.Mochila getMochila() {
        return Mochila;
    }

    public void setMochila(KitEscolarEjercicio.Mochila mochila) {
        Mochila = mochila;
    }

    public KitEscolarEjercicio.Deportivo getDeportivo() {
        return Deportivo;
    }

    public void setDeportivo(KitEscolarEjercicio.Deportivo deportivo) {
        Deportivo = deportivo;
    }

    public Cuaderno getCuadernos() {
        return Cuadernos;
    }

    public void setCuadernos(Cuaderno cuadernos) {
        Cuadernos = cuadernos;
    }

    @Override
    public void create() {

    }
}
