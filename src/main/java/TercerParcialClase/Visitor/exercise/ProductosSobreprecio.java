package TercerParcialClase.Visitor.exercise;

public class ProductosSobreprecio implements IProducto {
    private double precio;
    private double adicion;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getAdicion() {
        return adicion;
    }

    public void setAdicion(int adicion) {
        this.adicion = adicion;
    }
    public void applyAdicion(){
        precio=precio+adicion;
    }
    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }
}
