package TercerParcialClase.Visitor.exercise;


public class IVA implements IVisitor {
    @Override
    public double visit(ProductosSobreprecio productosSobreprecio) {
        productosSobreprecio.applyAdicion();
        double var=productosSobreprecio.getPrecio();
        return var+(var*0.05);
    }

    @Override
    public double visit(ProductosNormales productosNormales) {
        double var=productosNormales.getPrecio();
        return var+(var*0.05);
    }
    @Override
    public double visit(ProductosDescuento productosDescuento) {
        productosDescuento.applyDescuento();
        double var=productosDescuento.getPrecio();
        return var+(var*0.05);
    }
}
