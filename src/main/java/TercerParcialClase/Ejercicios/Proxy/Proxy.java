package TercerParcialClase.Ejercicios.Proxy;

public class Proxy implements IServidor  {
    private enumTipo tipo;
    private Servidor servidor;
    private Servidor servidorbackup=null;

    public Proxy (Servidor servidor){

        this.servidor=servidor;
//        realSubject = new Server(attribute);
    }


    @Override
    public void descarga() {

            servidor.descarga();

    }

    @Override
    public void carga(String archivo, enumTipo tipo) {
        if(tipo==enumTipo.RAR||tipo==enumTipo.ZIP){
            servidor.carga(archivo,tipo);
            cloneServidor();
        }
        else{
            System.out.println("Tipo de archivo incompatible ");
        }

    }

    public void cloneServidor() {
        servidorbackup = new Servidor();
        servidorbackup.setArchivo(servidor.getArchivo());
        servidorbackup.setTipo(servidor.getTipo());

    }
}