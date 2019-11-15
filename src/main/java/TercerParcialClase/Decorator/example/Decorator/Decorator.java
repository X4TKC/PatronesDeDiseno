package TercerParcialClase.Decorator.example.Decorator;

public abstract class Decorator implements Ide {
    private Ide componente;

    public Decorator(Ide componente){
        this.componente = componente;
    }

    public void operation(){
        componente.operation();
    }
}