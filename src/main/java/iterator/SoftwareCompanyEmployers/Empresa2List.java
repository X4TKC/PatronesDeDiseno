package iterator.SoftwareCompanyEmployers;



public class Empresa2List implements IList {

    private Employer[] employers;

    private int position;

    public Empresa2List(int numero){
        position=0;
        employers= new Employer[numero];
    }
    public void add(Employer value){
        employers[position]=value;
        position++;
    }
    @Override
    public IteratorEmpresa2List iterator() {
        return new IteratorEmpresa2List(this.employers);
    }
}
