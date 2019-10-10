package factoryMethod.basic;

public class ProductConcrete implements IProduct{
    Base1 base1;
    Base2 base2;
    public Base1 getBase1() {
        return base1;
    }

    public void setBase1(Base1 base1) {
        this.base1 = base1;
    }

    public Base2 getBase2() {
        return base2;
    }

    public void setBase2(Base2 base2) {
        this.base2 = base2;
    }




    @Override
    public void create() {

    }
}
