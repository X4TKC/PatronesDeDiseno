package factory;

public class FactoryProduct2 {
    public static IProduct make(String type){
        IProduct product;
        switch(type){
            case "product1":
                product = new ProductConcrete3();
                break;

            case "product2":
                product = new ProductConcrete4();
                break;

            default:
                product = new ProductConcrete4();
                break;
        }
        return product;
    }
}
