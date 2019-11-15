package TercerParcialExamen.Decorator;

public class Celular implements ICelular {
	private enumMarcas enumMarcas;
	private int ram;
	private int almacenamiento;
	private String cpu;
    private int precioInicial;
	public Celular(enumMarcas enumMarcas, int precioInicial, int ram, int almacenamiento, String cpu) {
		this.enumMarcas = enumMarcas;
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
        System.out.println("Precio: "+ this.enumMarcas.name() + ": " + this.getPrecioTotal());
        System.out.println("Caracteristicas: RAM: " + this.ram + " Almacenamiento: " + this.almacenamiento + " CPU: " + this.cpu);
    }
	@Override
	public int getAlmacenamientoTotal() {
		return almacenamiento;
	}
}
