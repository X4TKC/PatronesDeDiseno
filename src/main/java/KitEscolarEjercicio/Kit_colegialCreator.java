package KitEscolarEjercicio;

public class Kit_colegialCreator extends KitCreator{
    @Override
    public Kit factoryMethodProduct() {
        Kit_colegial kit_colegial = new Kit_colegial();
Mochila mochila = new Mochila();
Libros libros = new Libros();
Computadora computadora = new Computadora();
        kit_colegial.setComputadora(computadora);
        kit_colegial.setLibros(libros);
        kit_colegial.setMochila(mochila);
        return kit_colegial;
    }
}
