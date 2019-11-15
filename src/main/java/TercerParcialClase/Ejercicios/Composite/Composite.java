package TercerParcialClase.Ejercicios.Composite;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> list = new ArrayList<>();
    public Composite(int precio){
        super(precio);
    }
    public Composite(){}

    @Override
    public void print() {
        // some actions when we do iteration with list
        System.out.println("Name : "+getName()+" Precio : "+ getPrecio());
        for (Component comp: list
                ) {

            comp.print();
        }

    }

    @Override
    public void add(Component component) {

        list.add(component);
        this.setPrecio(getPrecio()+component.getPrecio());
        if(list.size()>2&&component.getName().equals("Archivo")){
            setName("Laboratorio");
        }
        else if(list.size()>1&&component.getName().equals("Laboratorio")){
            setName("Contenedor");
        }


    }

    @Override
    public void remove(Component component) {

        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getPrecio()+" "+list.get(position).getName());
    }
}