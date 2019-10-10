package FactoryBrowser;

public class Chrome extends Browser {
    @Override
    public void create() {
        System.out.println("Creando navegador Chrome");
    }
}
