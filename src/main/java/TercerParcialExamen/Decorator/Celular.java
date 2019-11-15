package TercerParcialExamen.Decorator;

public class Celular implements ICelular {
	private Marcas marcas;
	private int ram;
	private int almacenamiento;
	private String cpu;
    private int precioInicial;
    
	public Celular(Marcas marcas, int precioInicial, int ram, int almacenamiento, String cpu) {
		this.marcas = marcas;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
		this.cpu = cpu;
		this.precioInicial = precioInicial;
	}
	
	@Override
    public int getPrecioTotal() {
        return precioInicial;
    }
	
    @Override
    public void operation() {
        System.out.println("Precio inicial de "+ this.marcas.name() + ": " + this.getPrecioTotal());
        System.out.println("Caracteristicas iniciales: RAM de " + this.ram + " - Almacenamiento de " + this.almacenamiento + " - CPU " + this.cpu);
    }

	@Override
	public int getAlmacenamientoTotal() {
		return almacenamiento;
	}
    
}
