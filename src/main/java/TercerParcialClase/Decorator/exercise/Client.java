package TercerParcialClase.Decorator.exercise;


public class Client {
    public static void main(String[] args) {
        IComputadora computadora = new Computadora();
        computadora = new Monitor(computadora,50);
        computadora = new Teclado(computadora,10);
        computadora = new Mouse(computadora,15);
        computadora = new TarjetaVideo(computadora,25);

        computadora.operation();

        System.out.println("El precio total es : "+computadora.getPrecioTotal());

    }
}