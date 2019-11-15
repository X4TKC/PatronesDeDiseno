package TercerParcialClase.Decorator.basic;

public abstract class Decorator implements Component{
    private Component componente;

    public Decorator(Component componente){
        this.componente = componente;
    }

    public void operation(){
        componente.operation();
    }
}