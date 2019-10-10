package factory;

public class Client {
    public static void main(String[] args){
        //FactoryProduct.make("product1").operation();
        FactoryProduct2.make("product3").operation();
        FactoryProduct.make(FactoryProduct.ProductCreator.product1);
        FactoryProduct.make(FactoryProduct.ProductCreator.product2);
    }
}
