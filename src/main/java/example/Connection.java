package example;

public class Connection {
    private static Connection myInstance=null;

    private Connection(){

     //   System.out.println("Creating connection to the data base");

    }
    public synchronized static Connection getInstance(){
        if(myInstance ==null)
            myInstance= new Connection();
        return myInstance;
    }
    /**
     *
     *
     * @param value
     */
    public void save(String value){
        //System.out.println("Value : " +value+" has been saved in the DB");
    }
}
