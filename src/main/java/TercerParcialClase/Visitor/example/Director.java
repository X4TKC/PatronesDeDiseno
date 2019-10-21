package TercerParcialClase.Visitor.example;

public class Director implements IPersona {
    private String nombre;
    private int descuento=50;
    private int dinero;

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }


}