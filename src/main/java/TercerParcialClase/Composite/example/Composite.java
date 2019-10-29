package TercerParcialClase.Composite.example;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> list = new ArrayList<>();
    public Composite(String name){
        super(name);
    }

    @Override
    public void print() {
        // some actions when we do iteration with list
        for (Component comp: list
                ) {
            comp.print();
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