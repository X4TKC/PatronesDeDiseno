package Interpreter.basic;

public class Client {

    public static void main ( String[] args){
        String toInterpretate= "* a e i o u u u u u A E I O U U U U";
        System.out.println("Evaluate : "+toInterpretate+"\nInterpretate : " + new Parser(toInterpretate).evaluate());
    }
}
