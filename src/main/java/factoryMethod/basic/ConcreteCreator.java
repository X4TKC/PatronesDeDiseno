package factoryMethod.basic;

public class ConcreteCreator extends Creator {
    @Override
    public IProduct factoryMethodProduct() {
        ProductConcrete productConcrete = new ProductConcrete();
        Base1 base1 = new Base1();
        Base2 base2 = new Base2();
        productConcrete.setBase1(base1);
        productConcrete.setBase2(base2);
        return productConcrete;
    }
}
