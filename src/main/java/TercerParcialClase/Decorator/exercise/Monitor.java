package TercerParcialClase.Decorator.exercise;

public class Monitor extends Decorator {
    private String attribute1;
    private int precio;
    private int precioTotal;
    public Monitor(IComputadora componente,int precio) {
        super(componente);
        this.precio=precio;
        this.precioTotal=precio+componente.getPrecioTotal();

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
        this.attribute1 = "Monitor";
        System.out.println("Adding "+attribute1+ " Precio :"+ this.getPrecio());

    }
}
