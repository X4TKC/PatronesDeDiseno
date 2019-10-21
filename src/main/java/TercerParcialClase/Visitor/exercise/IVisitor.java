package TercerParcialClase.Visitor.exercise;



public interface IVisitor {
     double visit(ProductosNormales estudiante);
     double visit(ProductosDescuento productosDescuento);
     double visit(ProductosSobreprecio productosSobreprecio);

}