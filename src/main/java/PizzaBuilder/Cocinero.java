package PizzaBuilder;

public abstract class Cocinero {
    protected Pizza pizza;

    public Pizza getPizza(){return pizza;}
    public void createPizza(){pizza = new Pizza();}
    public abstract void buildMasa();
    public abstract void buildTipoDeQueso();
    public abstract void buildSalsa();
}
