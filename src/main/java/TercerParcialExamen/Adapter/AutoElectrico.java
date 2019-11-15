package TercerParcialExamen.Adapter;

public class AutoElectrico implements IAuto{
    public AutoElectrico() {
    }

    public void cargar(int bateria) {
        if (bateria < 100 && bateria > 0 && bateria % 2 == 0) {
            System.out.println("Se cargo: " + bateria + "% de bateria");
        } else {
            System.out.println("Porfavor introduzca una cantidad de bateria adecuada. ");
        }

    }

    public int estadoElectricidad() {
        int numero = (int)(Math.random() * 10.0D) + 1;
        System.out.println("Combustible de automovil electrico: " + numero);
        return numero;
    }
}
