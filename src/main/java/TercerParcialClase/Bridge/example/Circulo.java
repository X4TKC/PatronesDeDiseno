package TercerParcialClase.Bridge.example;

public class Circulo implements IFigura {
    private Color color;

    public Circulo (Color color){
        this.color = color;
    }
    @Override
    public void dibujar() {
        System.out.println("Dibujandoooo");
        color.pintar();
    }


}
