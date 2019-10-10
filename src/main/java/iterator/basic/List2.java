package iterator.basic;

import java.util.Vector;

public class List2 implements IList {
    Vector <String> nombres;

    public List2(){
        nombres = new Vector<>();
    }
    public void add(String value){
        nombres.add(value);
    }

    @Override
    public IteratorList2 iterator() {
        return new IteratorList2(this.nombres);
    }

}
