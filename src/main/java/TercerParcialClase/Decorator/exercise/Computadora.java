package TercerParcialClase.Decorator.exercise;

public class Computadora implements IComputadora {
    @Override
    public int getPrecioTotal() {
        return precioTotal;
    }
    @Override
    public void operation() {
        System.out.println("Precio inicial :"+this.getPrecioTotal());
    }
}
