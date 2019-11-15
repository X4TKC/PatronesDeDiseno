package TercerParcialExamen.Decorator;

public abstract class Decorator implements ICelular {
    private ICelular componente;

    public Decorator(ICelular componente){
        this.componente = componente;
    }

    public void operation(){
        componente.operation();
    }
}