package iterator.SoftwareCompanyEmployers;

import java.util.HashMap;

public class IteratorEmpresaGeneralList implements Iterator  {
    private int position;
    private HashMap<Integer,Employer> employers;
    public IteratorEmpresaGeneralList(HashMap<Integer,Employer> nombres){
        this.employers=nombres;
    }
    @Override
    public Object next() {
        return employers.get(position++);
    }

    @Override
    public boolean hasNext() {
        return employers.size() != 0 && position<employers.size();
    }
}
