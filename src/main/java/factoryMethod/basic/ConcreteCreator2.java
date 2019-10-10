package factoryMethod.basic;

public class ConcreteCreator2 extends Creator{
    @Override
    public IProduct factoryMethodProduct() {
        ProductConcrete2 productConcrete2 = new ProductConcrete2();
        Base1 base1 = new Base1();
        Base2 base2 = new Base2();
        productConcrete2.setBase1(base1);
        productConcrete2.setBase2(base2);
        return productConcrete2;
    }
}
