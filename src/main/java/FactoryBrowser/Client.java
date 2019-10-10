package FactoryBrowser;

public class Client {
    public static void main(String[] args){
        FactoryBrowser.make(EnumBrowser.Chrome).create();

        Chrome a = (Chrome) new ChromeCreator().factoryMethodProduct();
        
    }
}
