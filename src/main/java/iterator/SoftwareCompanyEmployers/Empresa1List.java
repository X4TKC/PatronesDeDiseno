package iterator.SoftwareCompanyEmployers;


import java.util.ArrayList;

public class Empresa1List implements IList {

    private ArrayList<Employer> employers;

    private int position;

    public Empresa1List(){
        position=0;
        employers= new ArrayList<>();
    }
    public void add(Employer value){
        employers.add(value);
        position++;
    }
    @Override
    public IteratorEmpresa1List iterator() {
        return new IteratorEmpresa1List(this.employers);
    }
}
