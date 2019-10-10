package iterator.SoftwareCompanyEmployers;



import java.util.ArrayList;
import java.util.Stack;

public class Empresa4List implements IList {

    private Stack<Employer> employers;

    private int position;

    public Empresa4List(){
        position=0;
        employers= new Stack<>();
    }
    public void add(Employer value){
        employers.add(value);
        position++;
    }
    @Override
    public IteratorEmpresa4List iterator() {
        return new IteratorEmpresa4List(this.employers);
    }
}
