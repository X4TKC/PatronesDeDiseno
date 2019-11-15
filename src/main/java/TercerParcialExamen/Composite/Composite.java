package TercerParcialExamen.Composite;

import java.util.ArrayList;

public class Composite extends Component {
    private ArrayList<Component> list = new ArrayList<>();
    public Composite(String text){
        super(text);
    }
    public Composite(){}


    @Override
    public void print() {
        // some actions when we do iteration with list
        System.out.println("Name : "+getName()+" Numero de palabras : "+ getNumWords());
        for (Component comp: list
                ) {

            comp.print();
        }

    }

    @Override
    public void add(Component component) {

        list.add(component);
        this.setNumWords(getNumWords()+component.getNumWords());
        if(list.size()>2&&component.getName().equals("Archivo")){
            setName("Folders");
        }
        else if(list.size()>1&&component.getName().equals("Folders")){
            setName("Unidad de disco");
        }


    }

    @Override
    public void remove(Component component) {

        list.remove(component);
    }

    @Override
    public void getChild(int position) {
        System.out.println(list.get(position).getNumWords()+" "+list.get(position).getName());
    }
}