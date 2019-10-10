package KitEscolarEjercicio;

public class Kit_escolarCreator extends KitCreator{
    @Override
    public Kit factoryMethodProduct() {
        Kit_escolar kit_escolar = new Kit_escolar();
            Mochila mochila = new Mochila();
            Deportivo deportivo = new Deportivo();
            Cuaderno cuaderno = new Cuaderno();
            kit_escolar.setCuadernos(cuaderno);
            kit_escolar.setDeportivo(deportivo);
            kit_escolar.setMochila(mochila);
        return kit_escolar;
    }
}
