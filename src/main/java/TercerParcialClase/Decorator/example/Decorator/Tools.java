package TercerParcialClase.Decorator.example.Decorator;

public class Tools extends Decorator {
    public Tools(Ide componente){
        super(componente);
    }

    public void operation(){
        super.operation();
        addedBehavior();
        System.out.println("Tools");
    }

    public void addedBehavior(){
        System.out.println("Add new Behavior of tools");
    }
}