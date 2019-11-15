package TercerParcialClase.Composite.example;

public class Product extends Component {

    public Product(String name){
        super(name);
    }

    @Override
    public void print() {
        System.out.println("\t Archivo : "+this.getAttribute());
    }

    @Override
    public void add(Component component) {
        System.out.println("not applicable on Archivo");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable on Archivo");
    }

    @Override
    public void getChild(int position) {
        System.out.println("\t Archivo :"+this.getAttribute());
    }
}