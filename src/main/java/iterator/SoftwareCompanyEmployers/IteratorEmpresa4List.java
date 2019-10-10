package iterator.SoftwareCompanyEmployers;

import java.util.ArrayList;
import java.util.Stack;

public class IteratorEmpresa4List implements Iterator {
    private int position;
    private Stack<Employer> employers;
    public IteratorEmpresa4List(Stack<Employer> nombres){
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
