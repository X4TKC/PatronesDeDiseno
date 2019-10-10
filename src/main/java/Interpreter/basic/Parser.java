package Interpreter.basic;

import java.util.ArrayList;

public class Parser {

    private ArrayList<AbstractExpresion> parseTree = new ArrayList<>();
    private Context context;
    public Parser(String s){
        s=s.toLowerCase();
        context = new Context(s.replace(" ",""));

        for (String token: s.split(" ")
             ) {
            switch(token){
                case "a":
                    parseTree.add(new TerminalExpressionA());
                    break;
                case "e":
                    parseTree.add(new TerminalExpressionE());
                    break;
                case "i":
                    parseTree.add(new TerminalExpressionI());
                    break;
                case "o":
                    parseTree.add(new TerminalExpressionO());
                    break;
                case "u":
                    parseTree.add(new TerminalExpressionU());
                    break;
                default:
                    parseTree.add(new TerminalExpressionOther());
                    break;
            }

        }
    }
    public String evaluate(){
        for (AbstractExpresion e : parseTree)
            e.interpreter(context);
        return context.output;
    }
}
