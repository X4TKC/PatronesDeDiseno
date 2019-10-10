package iterator.example;

import java.util.List;


public class IteratorBancoBList implements Iterator {
    private List<Cliente> nombres;
    private int position;
    public IteratorBancoBList(List<Cliente> nombres){
        this.nombres=nombres;
        this.position=0;
    }
    @Override
    public Object next() {
        return nombres.get(position++);
    }

    @Override
    public boolean hasNext() {
        return position < nombres.size() && nombres.size() != 0;
    }
}
