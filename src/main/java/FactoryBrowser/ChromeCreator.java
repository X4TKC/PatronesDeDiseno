package FactoryBrowser;

public class ChromeCreator extends Creator {
    @Override
    public Browser factoryMethodProduct() {

        Chrome var = new Chrome();
        var.create();
        return var;
    }
}
