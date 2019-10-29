package TercerParcialClase.Composite.example;

public class Product extends Component {

    public Product(String name){
        super(name);
    }

    @Override
    public void print() {
        System.out.println("\t Item : "+this.getAttribute());
    }

    @Override
    public void add(Component component) {
        System.out.println("not applicable on Item");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable on Item");
    }

    @Override
    public void getChild(int position) {
        System.out.println("\t Item :"+this.getAttribute());
    }
}