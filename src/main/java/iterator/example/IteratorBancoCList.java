package iterator.example;

import java.util.HashMap;

public class IteratorBancoCList implements Iterator {
    private HashMap<Integer,Cliente> clientes;
    private int position;
    public IteratorBancoCList(HashMap<Integer,Cliente> value){
        this.clientes=value;
        this.position=0;
    }

    @Override
    public Object next() {
        return clientes.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < clientes.size() && clientes.size() != 0;
    }
}
