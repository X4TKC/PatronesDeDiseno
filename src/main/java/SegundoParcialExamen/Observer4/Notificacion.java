package SegundoParcialExamen.Observer4;

public class Notificacion {
    private String titulo;
    private enumCategoria categoria;

    public Notificacion(String titulo, enumCategoria categoria){
        this.titulo=titulo;
        this.categoria=categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public enumCategoria getCategoria() {
        return categoria;
    }

    public void setCategoria(enumCategoria categoria) {
        this.categoria = categoria;
    }
}
