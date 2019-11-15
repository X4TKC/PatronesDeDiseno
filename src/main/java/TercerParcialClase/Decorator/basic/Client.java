package TercerParcialClase.Decorator.basic;

public class Client {
    public static void main(String[] args) {
        Component objectConcrete = new ComponentConcrete();
        objectConcrete = new DecoratorConcreteA(objectConcrete);
        objectConcrete = new DecoratorConcreteB(objectConcrete);

        objectConcrete.operation();
    }
}