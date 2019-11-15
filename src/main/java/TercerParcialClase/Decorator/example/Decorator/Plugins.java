package TercerParcialClase.Decorator.example.Decorator;

public class Plugins extends Decorator {
    public Plugins(Ide componente){
        super(componente);
    }

    public void operation(){
        super.operation();
        addedBehavior();
        System.out.println("Plugins");
    }

    public void addedBehavior(){
        System.out.println("Add new Behavior of plugins");
    }
}