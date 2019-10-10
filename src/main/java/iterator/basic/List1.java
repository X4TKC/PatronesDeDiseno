package iterator.basic;

public class List1 implements IList{

    private int position;
    private String [] nombres;
    public List1(){
        position=0;
        nombres= new String[4];
    }
    public void add(String value){
        nombres[position]=value;
        position++;
    }

    @Override
    public IteratorList1 iterator() {
        return new IteratorList1(this.nombres);
    }
}
