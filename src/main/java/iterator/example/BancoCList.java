package iterator.example;

import java.util.HashMap;

public class BancoCList implements IList {
    private HashMap<Integer,Cliente> clientes;

    public BancoCList(){
        clientes=new HashMap<>();
    }
    public void add(int var,Cliente value){

        clientes.put(var,value);

    }
    @Override
    public IteratorBancoCList iterator() {
        return new IteratorBancoCList(this.clientes);
    }
}
