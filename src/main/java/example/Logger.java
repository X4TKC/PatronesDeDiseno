package example;

public class Logger {
    private static Logger myInstance=null;
    private String nameFile;

    private Logger(){
        nameFile="/tmp/log.txt";
      // System.out.println("Creando singleton");

    }
    public synchronized static Logger getInstance(){
        if(myInstance ==null)
            myInstance= new Logger();
        return myInstance;
    }

    /**
     *
     *
     * @param nivel INFO, WARN, ERROR
     * @param value
     */
    public void write(String nivel, String value){
      //  System.out.println("FILE : " +nameFile+"\t"+nivel+"\t>\t"+value);
    }
}
