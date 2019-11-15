package TercerParcialClase.Composite.example;


public class Client {
    public static void main(String []args){
        Composite kidProduct1 = new Composite("kid Archivo");
        kidProduct1.add(new Product("Producto 1"));
        kidProduct1.add(new Product("Producto 2"));
        kidProduct1.add(new Product("Producto 3"));
        Composite kidProduct2 = new Composite("kid Archivo");
        kidProduct2.add(new Product2("Producto 1"));
        kidProduct2.add(new Product2("Producto 2"));
        kidProduct2.add(new Product2("Producto 3"));

        Composite boxProduct = new Composite("box Archivo");
        boxProduct.add(kidProduct1);
        boxProduct.add(kidProduct2);
        boxProduct.print();

    }
}