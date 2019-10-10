package PizzaBuilder;

public class Menu {
    private Cocinero pizzaCooker;


    public void setPizzaCooker(Cocinero builder){pizzaCooker=builder; }

    public Pizza getPizza(){return pizzaCooker.getPizza();}

    public void buildPizza(){
        pizzaCooker.createPizza();
        pizzaCooker.buildMasa();
        pizzaCooker.buildSalsa();
        pizzaCooker.buildTipoDeQueso();
    }
}
