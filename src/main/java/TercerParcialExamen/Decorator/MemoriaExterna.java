package TercerParcialExamen.Decorator;

public class MemoriaExterna extends Decorator{
	private String name;
    private int precio;
    private int precioTotal;
    private int almacenamiento;
    private int almacenamientoTotal;
    
    public MemoriaExterna(ICelular componente, int precio, int almacenamiento) {
        super(componente);
        this.precioTotal = precio + componente.getPrecioTotal();
        this.precio = precio;
        this.almacenamientoTotal = almacenamiento + componente.getAlmacenamientoTotal();
        this.almacenamiento = almacenamiento;
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
        this.name = "Memoria externa";
        System.out.println("Adding " + name + " Precio: " + this.getPrecio() + " Memoria: "+ this.getAlmacenamiento());
    }

	@Override
	public int getAlmacenamientoTotal() {
		return almacenamientoTotal;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}
}
