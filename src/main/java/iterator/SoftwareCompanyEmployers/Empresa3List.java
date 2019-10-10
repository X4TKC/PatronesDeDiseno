package iterator.SoftwareCompanyEmployers;



import java.util.ArrayList;
import java.util.Vector;

public class Empresa3List implements IList {

    private Vector<Employer> employers;

    private int position;

    public Empresa3List(){
        position=0;
        employers= new Vector<>();
    }
    public void add(Employer value){
        employers.add(value);
        position++;
    }
    @Override
    public IteratorEmpresa3List iterator() {
        return new IteratorEmpresa3List(this.employers);
    }
}
