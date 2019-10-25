package TercerParcialClase.Adapter.exercise;

public class SingletonMonto {
    private static SingletonMonto instance=null;
    private int monto=7;

    public int getMonto() {
        return monto;
    }



    public static synchronized SingletonMonto getInstance(){
        if (instance==null){
            instance = new SingletonMonto();

        }
        return instance;
    }
}
