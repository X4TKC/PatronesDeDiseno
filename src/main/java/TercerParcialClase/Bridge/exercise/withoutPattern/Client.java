package TercerParcialClase.Bridge.exercise.withoutPattern;

public class Client {
    public static void main(String[] args){
        Windows windows = new Windows();
        Linux linux = new Linux();
        windows.plataforma();
        linux.plataforma();
        Windows7x64 windows7x64 = new Windows7x64();
        Windows7x86 windows7x86 = new Windows7x86();
        Linuxx64 linuxx64 = new Linuxx64();
        Linuxx86 linuxx86 = new Linuxx86();
        windows7x64.plataforma();
        windows7x86.plataforma();
        linuxx64.plataforma();
        linuxx86.plataforma();
    }
}
