package SegundoParcialClase.strategy.basic;
public class Context {


    private IStrategy strategy;
    private int Attribute1;
    private String Attribute2;

    public IStrategy getStrategy() {
        return strategy;
    }
    public void setAttribute1(int attribute1){
        this.Attribute1=attribute1;
        if(this.Attribute1<=10)
            defineStrategy1();
        else
            defineStrategy2();
    }
//    public void setStrategy(IStrategy strategy) {
//        this.strategy = strategy;
//    }
    public void defineStrategy1() {
        this.strategy = new StrategyConcrete1();
    }
    public void defineStrategy2() {
        this.strategy = new StrategyConcrete2();
    }

    public Context(){
    }

    public void execute(){
        strategy.execute();
    }
}