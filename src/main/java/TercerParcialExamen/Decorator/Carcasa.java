package TercerParcialExamen.Decorator;

public class Carcasa extends Decorator {
    
	private String name;
    private int precio;
    private int precioTotal;

    private int almacenamientoTotal;
    
    public Carcasa(ICelular componente, int precio) {
        super(componente);
        this.precio = precio;
        this.precioTotal = precio + componente.getPrecioTotal();
        this.almacenamientoTotal = componente.getAlmacenamientoTotal();
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
        this.name = "Carcasa";
        System.out.println("Adding " + name + " Precio: " + this.getPrecio());
    }

	@Override
	public int getAlmacenamientoTotal() {
		return almacenamientoTotal;
	}

	public void setAlmacenamientoTotal(int almacenamientoTotal) {
		this.almacenamientoTotal = almacenamientoTotal;
	}


    
}
