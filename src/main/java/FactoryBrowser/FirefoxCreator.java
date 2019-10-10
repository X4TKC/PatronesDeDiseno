package FactoryBrowser;

public class FirefoxCreator extends Creator {
    @Override
    public Browser factoryMethodProduct() {

        Firefox var = new Firefox();
        var.create();
        return var;
    }
}
