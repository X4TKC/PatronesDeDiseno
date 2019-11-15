package TercerParcialClase.Decorator.exercise;

public abstract class Decorator implements IComputadora {
    private IComputadora componente;

    public Decorator(IComputadora componente){
        this.componente = componente;
    }

    public void operation(){
        componente.operation();
    }
}