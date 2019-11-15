package TercerParcialClase.Decorator.example.Decorator;

public class Client {
    public static void main(String[] args) {
        Ide Eclipse2019 = new Eclipse();
        Eclipse2019 = new Library(Eclipse2019);
        Eclipse2019 = new Plugins(Eclipse2019);
        Eclipse2019 = new Tools(Eclipse2019);

        Eclipse2019.operation();
    }
}