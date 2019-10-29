package TercerParcialClase.Proxy.exercise;

public class Cajero implements IBanco {
    private Cuenta cuenta;
    private Banco banco;

    public Cajero (Cuenta cuenta){
        this.cuenta= cuenta;
//        server = new Server(request);
    }

    @Override
    public void request() {
        if (banco ==null)
            banco = new Banco(cuenta);
        //some conditions //filters
        if (cuenta.getTipo()==enumMoney.Bs) {
            this.banco.request();
        }
        else if(cuenta.getTipo()==enumMoney.$){
            System.out.println("No se puede realizar el deposito pero su deposito con el tipo de cambio seria "+ (cuenta.getMonto()/7)+" $");
        }
        else if(cuenta.getTipo()==enumMoney.Euros){
            System.out.println("No se puede realizar el deposito pero su deposito con el tipo de cambio seria "+ (cuenta.getMonto()/10)+" Euros");
        }
        else{
            System.out.println("blocked");
        }


    }

}
