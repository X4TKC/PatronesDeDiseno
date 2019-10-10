package iterator.example;





import java.util.ArrayList;
import java.util.List;


public class BancoBList implements IList {

    private List<Cliente> clientes;

    private int position;
    public BancoBList(){
        position=0;
        clientes= new ArrayList<>();
    }
    public void add(Cliente value){
        clientes.add(value);
    }

    @Override
    public IteratorBancoBList iterator() {
        return new IteratorBancoBList(this.clientes);
    }
}
