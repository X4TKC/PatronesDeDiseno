package TercerParcialClase.Bridge.example;

public class Cuadrado implements IFigura {
    private Color color;

    public Cuadrado (Color color){
        this.color = color;
    }
    @Override
    public void dibujar() {
        System.out.println("Dibujandoooo");
        color.pintar();
    }

}
