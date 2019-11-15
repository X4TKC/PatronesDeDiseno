package TercerParcialClase.Decorator.exercise;

public class Mouse extends Decorator{
    private String attribute1;
    private int precio;
    private int precioTotal;
    public Mouse(IComputadora componente,int precio) {
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
        this.attribute1 = "Mouse";
        System.out.println("Adding "+attribute1+ " Precio :"+ this.getPrecio());

    }
}
