package TercerParcialClase.Decorator.exercise;

public class Teclado extends Decorator{
    private String attribute1;
    private int precio;
    private int precioTotal;
    public Teclado(IComputadora componente,int precio) {
        super(componente);
        this.precioTotal=precio+componente.getPrecioTotal();
        this.precio=precio;
    }

    @Override
    public int getPrecioTotal() {

        return precioTotal;
    }
    public int getPrecio(){
        return precio;
    }
    public void operation(){
        super.operation();
        this.attribute1 = "Teclado";
        System.out.println("Adding "+attribute1+ " Precio :"+ this.getPrecio());

    }
}
