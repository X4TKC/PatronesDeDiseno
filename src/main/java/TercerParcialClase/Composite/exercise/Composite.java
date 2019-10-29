package TercerParcialClase.Composite.exercise;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> list = new ArrayList<>();
    public Composite(int estimacion, String name){
        super(estimacion,name);
    }

    @Override
    public void print() {
        // some actions when we do iteration with list
        System.out.println("Name : "+getName()+" Estimacion : "+ getEstimacion());
        for (Component comp: list
                ) {

            comp.print();
        }

    }

    @Override
    public void add(Component component) {

        list.add(component);
        this.setEstimacion(getEstimacion()+component.getEstimacion());


    }

    @Override
    public void remove(Component component) {

        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getEstimacion()+" "+list.get(position).getName());
    }
}