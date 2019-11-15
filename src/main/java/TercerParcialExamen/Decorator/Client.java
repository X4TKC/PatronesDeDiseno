package TercerParcialExamen.Decorator;

public class Client {
	
    public static void main(String[] args) {
    	Marcas marcas = null;
        
    	ICelular celular = new Celular(marcas.Sony, 1000, 33, 16,"Snapdragon 810"); //marca, precio celular, ram, almacenamiento, cpu
        celular = new Carcasa(celular, 50); //precio
        celular = new VidrioTemplado(celular, 15); //precio
        celular = new MemoriaExterna(celular, 25, 32); //precio, almacenamiento

        celular.operation();

        System.out.println("Precio total: " + celular.getPrecioTotal() + " - Almacenamiento total: " + celular.getAlmacenamientoTotal());

    }
    
}