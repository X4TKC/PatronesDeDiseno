package TercerParcialClase.Visitor.basic;

public class ConcreateVisitor implements IVisitor {

    @Override
    public double visit(ElementConcreateA elementConcreateA) {
        //some process
        System.out.println("Some Process Visitor Element A");
        elementConcreateA.getAttribute2();
        return 0;
    }

    @Override
    public double visit(ElementConcreateB elementConcreateB) {
        elementConcreateB.getAttribute2();
        System.out.println("Some Process Visitor Element B");
        //some process
        return 0;
    }
}