package TercerParcialClase.Bridge.exercise.withPattern;

public class Client {
    public static void main(String[] args){
        ArquitecturaX64 arquitecturaX64 = new ArquitecturaX64();
        ArquitecturaX86 arquitecturaX86 = new ArquitecturaX86();
        Windows windows = new Windows(arquitecturaX64);
        Linux linux = new Linux(arquitecturaX86);
        Mac mac = new Mac(arquitecturaX64);
        mac.plataforma();
        windows.plataforma();
        linux.plataforma();
    }
}
