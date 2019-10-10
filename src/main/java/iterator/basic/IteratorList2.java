package iterator.basic;

import java.util.Vector;

public class IteratorList2 implements Iterator {
    private Vector<String> nombres;
    private int position;
    public IteratorList2(Vector<String> nombres){
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
