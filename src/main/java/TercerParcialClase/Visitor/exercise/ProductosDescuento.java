package TercerParcialClase.Visitor.exercise;

public class ProductosDescuento implements IProducto {
    private double precio;
    private double descuento;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    public void applyDescuento(){
        precio=precio-(precio*(descuento/100));

    }
    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }
}
