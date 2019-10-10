package Builder.basic;

public class ProductConcreteBuilder extends ProductBuilder {

    @Override
    public void buildAttribute1() {
        producto.setAttribute1("Caracteristica concreta 1");
    }

    @Override
    public void buildAttribute2() {
        producto.setAttribute2("Caracteristica concreta 2");
    }

    @Override
    public void buildAttribute3() {
        producto.setAttribute3("Caracteristica concreta 3");
    }
}
