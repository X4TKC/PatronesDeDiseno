package TercerParcialClase.Composite.basic;

public class Leaf extends Component {

    public Leaf(String attribute){
        super(attribute);
    }

    @Override
    public void operation() {
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