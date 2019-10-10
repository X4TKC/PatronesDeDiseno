package PizzaBuilder;

public class PizzaCarnivora extends Cocinero {
    @Override
    public void buildMasa() {
        pizza.setMasa("Masa carnivora");
    }

    @Override
    public void buildTipoDeQueso() {
        pizza.setTipoDeQueso("Cheddar");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("TomateCarnivora");
    }
}
