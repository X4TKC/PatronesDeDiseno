package TercerParcialClase.Visitor.basic;
public class ElementConcreateB implements IElemento {
    private String attribute1;
    private int attribute2;
    public int getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(int attribute2) {
        this.attribute2 = attribute2;
    }
    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }

    @Override
    public String method1() {
        return null;
    }

    @Override
    public String method2() {
        return null;
    }

    @Override
    public int method3() {
        return 0;
    }
}