package Interpreter.sintaxisGherkins;

public class Client {

    public static void main ( String[] args){
        String toInterpretate= "Como asd Quiero asd Para asd Como 1";
        System.out.println("Evaluate : "+toInterpretate+"\nInterpretate : " + new Parser(toInterpretate).evaluate());
    }
}
