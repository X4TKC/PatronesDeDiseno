package singleton;

public class Singleton2 {
    private static final Singleton2 instance=new Singleton2();
    private Singleton2(){
        System.out.println("Creating draft.singleton.Singleton");
    }
    public static Singleton2 getUniqueInstance(){
       return instance;
    }
    public void myInstance(){
        System.out.println("Using singleton.Singleton2");
    }
    ///no se puede debido a que el atributo es final
/*
    public void destroyInstance(){
        instance=null;
    }
  */
}
