package BuilderOther;

public abstract class BuilderComputadora {
    protected Computadora computadora;

    public Computadora getComputadora(){return computadora; }
    public void createComputadora(){computadora = new Computadora();}

    public abstract void buildAttribute1();

    public abstract void buildAttribute2();

    public abstract void buildAttribute3();
}
