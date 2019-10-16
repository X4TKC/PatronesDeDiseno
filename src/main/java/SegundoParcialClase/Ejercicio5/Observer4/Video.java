package SegundoParcialClase.Ejercicio5.Observer4;

public class Video {
    private String tipo;
    private String titulo;
    private String tiempo;
    private enumCategoria categoria;

    public Video(String tipo, String titulo,String tiempo, enumCategoria categoria){
        this.tipo=tipo;
        this.titulo=titulo;
        this.tiempo=tiempo;
        this.categoria=categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public enumCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(enumCategoria categoria) {
        this.categoria = categoria;
    }
}
