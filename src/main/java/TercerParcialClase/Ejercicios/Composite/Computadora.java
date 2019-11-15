package TercerParcialClase.Ejercicios.Composite;

public class Computadora extends Component {

    public Computadora(int precio){
        super(precio);
    }

    @Override
    public void print() {
        System.out.println("\t Name : "+this.getName()+" Precio :" + this.getPrecio());
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
        System.out.println(this.getPrecio()+" "+this.getName());

    }
}