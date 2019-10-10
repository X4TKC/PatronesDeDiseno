package FactoryBrowser;

public class IECreator extends Creator {
    @Override
    public Browser factoryMethodProduct() {
        IE var = new IE();
        var.create();
        return var;

    }
}
