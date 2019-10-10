package PizzaBuilder;

public class PizzaHawuaina extends Cocinero {
    @Override
    public void buildMasa() {
        pizza.setMasa("masaHawuaina");
    }

    @Override
    public void buildTipoDeQueso() {
        pizza.setTipoDeQueso("QuesoHawuaina");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("SalsaHawuaina");
    }
}
