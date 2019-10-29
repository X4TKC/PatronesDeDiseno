package factory;



public class FactoryProduct {

    public enum ProductCreator{
        product1, product2;
    }
//    public static Item make(String type){
//        Item product;
//        switch(type){
//            case "product1":
//                product = new ProductConcrete();
//                break;
//
//            case "product2":
//                product = new ProductConcrete2();
//                break;
//
//            default:
//                product = new ProductConcrete2();
//                break;
//        }
//        return product;
//    }
    public static Product make(ProductCreator type){
    Product product;
    switch(type){
        case product1:
            product = new ProductConcrete();
            break;

        case product2:
            product = new ProductConcrete2();
            break;

        default:
            product = new ProductConcrete2();
            break;
    }
    return product;
   }
}
