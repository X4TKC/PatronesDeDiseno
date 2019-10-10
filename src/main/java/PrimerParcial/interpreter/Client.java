package PrimerParcial.interpreter;

public class Client {

    public static void main ( String[] args){
        String toInterpretate= "1+2+3+10+1000";
        System.out.println("Evaluate : "+toInterpretate+"\nInterpretate : " + new Parser(toInterpretate).evaluate());
    }
}
