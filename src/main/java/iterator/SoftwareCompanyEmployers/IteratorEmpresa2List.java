package iterator.SoftwareCompanyEmployers;

import java.util.ArrayList;

public class IteratorEmpresa2List implements Iterator {
    private int position;
    private Employer[] employers;
    public IteratorEmpresa2List(Employer[] nombres){
        this.employers=nombres;
    }
    @Override
    public Object next() {
        return employers[position++];
    }

    @Override
    public boolean hasNext() {
        return employers.length != 0 && position<employers.length;
    }
}
