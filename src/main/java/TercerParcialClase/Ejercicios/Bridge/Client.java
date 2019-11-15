package TercerParcialClase.Ejercicios.Bridge;

public class Client {
    public static void main(String[] args){
        Euros euros = new Euros();
        Bolivianos bolivianos = new Bolivianos();
        Dolares dolares = new Dolares();
        Ahorro ahorro = new Ahorro(euros,500);
        Credito credito = new Credito(bolivianos,250);
        PlazoFijo plazoFijo = new PlazoFijo(dolares,125);
        ahorro.processAccount();
        credito.processAccount();
        plazoFijo.processAccount();

    }
}
