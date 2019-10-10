package FactoryBrowser;

public class IE extends Browser {
    @Override
    public void create() {
        System.out.println("Creando navegador IE");
    }
}
