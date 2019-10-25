package TercerParcialClase.Bridge.exercise.withPattern;

public class ArquitecturaX86 implements IArquitectura {
    private String name="x86";
    @Override
    public String getArquitectura() {
        return name;
    }
    @Override
    public void process(){
        System.out.println("Procesando con x86");
    }
}
