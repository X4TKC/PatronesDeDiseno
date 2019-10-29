package TercerParcialClase.Composite.exercise;

public class Item extends Component {

    public Item(int estimacion, String name){
        super(estimacion, name);
    }

    @Override
    public void print() {
        System.out.println("\t Item : "+this.getEstimacion()+" Name :" + this.getName());
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
        System.out.println(this.getEstimacion()+" "+this.getName());

    }
}