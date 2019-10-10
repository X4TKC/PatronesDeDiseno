package factoryMethod.basic;

public class Client {
    public static void main (String []args){
        ProductConcrete abc = (ProductConcrete) new ConcreteCreator().factoryMethodProduct();
    }
}
