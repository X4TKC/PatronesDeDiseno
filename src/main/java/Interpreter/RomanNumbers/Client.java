package Interpreter.RomanNumbers;

public class Client {

    public static void main ( String[] args){
        String toInterpretate= "III";
        System.out.println("Evaluate : "+toInterpretate+"\nInterpretate : " + new Parser(toInterpretate).evaluate());
    }
}
