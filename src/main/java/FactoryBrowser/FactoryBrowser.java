package FactoryBrowser;

public class FactoryBrowser {
    public static Browser make(EnumBrowser type){
        Browser browser;
        switch(type){
            case Chrome:
                browser = new Chrome();
                break;

            case IE:
                browser = new IE();
                break;
            case Firefox:
                browser = new Firefox();
                break;

            default:
                browser = new Chrome();
                break;
        }
        return browser;
    }
}
