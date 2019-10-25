package TercerParcialClase.Bridge.example;

public class Client {

    public static void main(String[] args){

        Blanco blanco = new Blanco();

        Cuadrado cuadrado = new Cuadrado(blanco);
        cuadrado.dibujar();
    }
}
