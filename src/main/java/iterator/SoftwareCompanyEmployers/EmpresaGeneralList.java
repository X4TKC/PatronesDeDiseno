package iterator.SoftwareCompanyEmployers;

import java.util.HashMap;

public class EmpresaGeneralList implements IList{
    private HashMap<Integer,Employer> employers;

    private int position;

    public EmpresaGeneralList(){
        position=0;
        employers= new HashMap<>();
    }
    public void add(IList empresa){
        Iterator iterator;
        iterator = empresa.iterator();
        while(iterator.hasNext()){
            Employer abc = (Employer) iterator.next();
            System.out.println(abc.getNombre());
            employers.put(position,abc);
        }


    }
    @Override
    public IteratorEmpresaGeneralList iterator() {
        return new IteratorEmpresaGeneralList(this.employers);
    }
}
