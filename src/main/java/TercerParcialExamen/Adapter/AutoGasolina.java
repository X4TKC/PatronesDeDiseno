package TercerParcialExamen.Adapter;
public class AutoGasolina implements IAuto {
     public void setLlenarGasolina(int gasolina) {
        if (gasolina < 100 && gasolina > 0) {
            System.out.println("Se anadio: " + gasolina + " litros de gasolina");
        } else {
            System.out.println("Cantidad de gasolina invalida. ");
        }
    }
    public int estadoCombustible() {
        int rnd = (int)(Math.random() * 100.0D) + 1;
        System.out.println("Combustible de automovil a gasolina: " + rnd);
        return rnd;
    }
}
