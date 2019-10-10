package Builder.basic;

public class Client {
    public static void main (String[] args){
        Director director = new Director();

        ProductBuilder productConcreteBuilder = new ProductConcreteBuilder();
        director.setProductBuilder(productConcreteBuilder);
        director.buildProduct();
        Producto product = director.getProduct();
    }
}
