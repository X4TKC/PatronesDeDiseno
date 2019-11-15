package TercerParcialClase.Decorator.basic;

public class DecoratorConcreteB extends Decorator{
    public DecoratorConcreteB(Component componente){
        super(componente);
    }

    public void operation(){
        super.operation();
        addedBehavior();
        System.out.println("Decorator B");
    }

    public void addedBehavior(){
        System.out.println("Add new Behavior");
    }
}