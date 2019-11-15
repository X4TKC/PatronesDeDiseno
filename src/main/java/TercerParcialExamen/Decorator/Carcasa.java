package TercerParcialExamen.Decorator;

public class Carcasa extends Decorator {
    
	private String attribute1;
    private int precio;
    private int precioTotal;
    private int almacenamiento;
    private int almacenamientoTotal;
    
    public Carcasa(ICelular componente, int precio) {
        super(componente);
        this.precio = precio;
        this.precioTotal = precio + componente.getPrecioTotal();
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
        this.attribute1 = "Carcasa";
        System.out.println("Adding " + attribute1 + " al precio de: " + this.getPrecio());
    }

	@Override
	public int getAlmacenamientoTotal() {
		return almacenamientoTotal;
	}

	public void setAlmacenamientoTotal(int almacenamientoTotal) {
		this.almacenamientoTotal = almacenamientoTotal;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}
    
}
