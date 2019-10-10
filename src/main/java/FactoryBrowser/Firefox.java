package FactoryBrowser;

public class Firefox extends Browser {
    @Override
    public void create() {
        System.out.println("Creando navegador Firefox");
    }
}
