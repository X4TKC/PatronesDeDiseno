package KitEscolarEjercicio;

public class Kit_colegial implements Kit {

    private Mochila mochila;
    private Libros libros;
    private Computadora computadora;
    public Mochila getMochila() {
        return mochila;
    }

    public void setMochila(Mochila mochila) {
        this.mochila = mochila;
    }

    public Libros getLibros() {
        return libros;
    }

    public void setLibros(Libros libros) {
        this.libros = libros;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }






    @Override
    public void create() {

    }
}
