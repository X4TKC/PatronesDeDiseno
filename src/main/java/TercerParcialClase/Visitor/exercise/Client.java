package TercerParcialClase.Visitor.exercise;



public class Client {

    public static void main (String []args){
        ProductosDescuento productosDescuento = new ProductosDescuento();
        ProductosNormales productosNormales = new ProductosNormales();
        ProductosSobreprecio productosSobreprecio = new ProductosSobreprecio();

        IVA iva= new IVA();
        productosDescuento.setPrecio(100);
        productosDescuento.setDescuento(15);
        productosNormales.setPrecio(100);
        productosSobreprecio.setPrecio(100);
        productosSobreprecio.setAdicion(15);


        System.out.println("Result A : "+productosDescuento.accept(iva));
        System.out.println("Result B : "+productosNormales.accept(iva));
        System.out.println("Result C : "+productosSobreprecio.accept(iva));




    }
}