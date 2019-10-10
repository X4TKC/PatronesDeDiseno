package iterator.SoftwareCompanyEmployers;

import java.util.ArrayList;
import java.util.Vector;

public class IteratorEmpresa3List implements Iterator {
    private int position;
    private Vector<Employer> employers;
    public IteratorEmpresa3List(Vector<Employer> nombres){
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
