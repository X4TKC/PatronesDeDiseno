package TercerParcialClase.Visitor.exercise;

public class ProductosNormales implements IProducto {
    private double precio=0;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }
}
