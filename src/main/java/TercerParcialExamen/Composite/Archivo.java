package TercerParcialExamen.Composite;

public class Archivo extends Component {

    public Archivo(String text){
        super(text);
    }

    @Override
    public void print() { System.out.println("\t Name : "+this.getName()+" Text: " +getText()+" Numero de palabras :" + this.getNumWords()); }

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
        System.out.println(this.getNumWords()+" "+this.getName());

    }
}