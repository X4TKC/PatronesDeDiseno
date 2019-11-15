package TercerParcialExamen.Adapter;
public class Gasolina implements IAutoNormal {
    public Gasolina() {
    }

    public void setLlenarGasolina(int gasolina) {
        if (gasolina < 100 && gasolina > 0) {
            System.out.println("Se introdujo: " + gasolina + " litros de gasolina");
        } else {
            System.out.println("Porfavor introduzca una cantidad de gasolina adecuada. ");
        }

    }

    public int estadoCombustible() {
        int numero = (int)(Math.random() * 100.0D) + 1;
        System.out.println("Combustible de automovil a gasolina: " + numero);
        return numero;
    }
}
