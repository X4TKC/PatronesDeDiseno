package Builder.basic;

public class Director {
    private ProductBuilder productBuilder;


    public void setProductBuilder(ProductBuilder builder){productBuilder=builder; }

    public Producto getProduct(){return productBuilder.getProducto();}

    public void buildProduct(){
        productBuilder.createProduct();
        productBuilder.buildAttribute1();
        productBuilder.buildAttribute2();
        productBuilder.buildAttribute3();
    }
}
