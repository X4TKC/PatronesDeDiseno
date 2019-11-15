package TercerParcialExamen.Decorator;

public class VidrioTemplado extends Decorator{
    
	private String attribute1;
    private int precio;
    private int precioTotal;
    private int almacenamiento;
    private int almacenamientoTotal;
    
    public VidrioTemplado(ICelular componente, int precio) {
        super(componente);
        this.precioTotal = precio + componente.getPrecioTotal();
        this.precio = precio;
        this.almacenamientoTotal = almacenamiento + componente.getAlmacenamientoTotal();
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
        this.attribute1 = "Vidrio templado";
        System.out.println("Adding "+ attribute1 + " al precio de: "+ this.getPrecio());
    }

	@Override
	public int getAlmacenamientoTotal() {
		return almacenamientoTotal;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}
    
}
