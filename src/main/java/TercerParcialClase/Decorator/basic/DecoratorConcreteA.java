package TercerParcialClase.Decorator.basic;

public class DecoratorConcreteA extends Decorator{
    private String attribute1;

    public DecoratorConcreteA(Component componente){
        super(componente);
    }

    public void operation(){
        super.operation();
        this.attribute1 = "Nueva propiedad";
        System.out.println("Adding Decorator "+attribute1);
    }
}