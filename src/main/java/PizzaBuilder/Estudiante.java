package PizzaBuilder;

public class Estudiante {
    public static void main (String[] args){
        Menu menu = new Menu();

        Cocinero pizzaCarnivora = new PizzaCarnivora();
        menu.setPizzaCooker(pizzaCarnivora);
        menu.buildPizza();
        Pizza pizza = pizzaCarnivora.getPizza();
        System.out.println(pizza.getMasa());
    }
}
