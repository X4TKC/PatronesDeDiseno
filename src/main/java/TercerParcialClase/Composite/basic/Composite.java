package TercerParcialClase.Composite.basic;
import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> list = new ArrayList<>();
    public Composite(String attribute){
        super(attribute);
    }

    @Override
    public void operation() {
        // some actions when we do iteration with list
        for (Component comp: list
                ) {
            comp.operation();
        }

    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getAttribute());
    }
}