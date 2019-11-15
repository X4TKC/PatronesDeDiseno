package TercerParcialClase.Ejercicios.Decorador;

public class Client {
    public static void main(String[] args) {
        IBanco banco = new Banco("Kevin",2000);
        banco = new BancaInternet(banco);
        banco = new SeguroCuenta(banco);
        banco = new Promocion(banco);

        banco.operation();


    }
}