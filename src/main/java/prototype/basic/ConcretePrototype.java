package prototype.basic;

public class ConcretePrototype implements IPrototype {
    private int attribute1;
    private String attribute2;

    public ConcretePrototype(){
    }
    public int getAttribute1(){return attribute1; }
    public void setAttribute1(int attribute1){this.attribute1=attribute1;}
    public String getAttribute2(){return attribute2;}
    public void setAttribute2(String attribute2){this.attribute2=attribute2;}

    @Override
    public Object clone() {
        ConcretePrototype cloneObj = new ConcretePrototype();
        cloneObj.setAttribute1(this.attribute1);
        cloneObj.setAttribute2(this.attribute2);
        return cloneObj;
    }
}
