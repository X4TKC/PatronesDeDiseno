package iterator.SoftwareCompanyEmployers;

import java.util.ArrayList;

public class IteratorEmpresa1List implements Iterator {
    private int position;
    private ArrayList<Employer> employers;
    public IteratorEmpresa1List(ArrayList<Employer> nombres){
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
