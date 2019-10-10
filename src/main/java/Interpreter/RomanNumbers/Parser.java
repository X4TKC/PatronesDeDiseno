package Interpreter.RomanNumbers;

import java.util.ArrayList;

public class Parser {

    private ArrayList<AbstractExpresion> parseTree = new ArrayList<>();
    private Context context;
    public Parser(String s){
        //s=s.toLowerCase();
        context = new Context(s);

        for (String token: s.split(" ")
             ) {

            switch(token){
//                case "I":
//                    parseTree.add(new TerminalExpressionOther());
//                    break;
//                case "II":
//                    parseTree.add(new TerminalExpressionOther());
//                    break;
//                case "III":
//                    parseTree.add(new TerminalExpressionOther());
//                    break;
//                case "IV":
//                    parseTree.add(new TerminalExpressionOther());
//                    break;
//                case "V":
//                    parseTree.add(new TerminalExpressionOther());
//                    break;
//                case "VI":
//                    parseTree.add(new TerminalExpressionOther());
//                    break;
//                case "VII":
//                    parseTree.add(new TerminalExpressionOther());
//                    break;
//                case "VIII":
//                    parseTree.add(new TerminalExpressionOther());
//                    break;
//                case "IX":
//                    parseTree.add(new TerminalExpressionOther());
//                    break;
//                case "X":
//                    parseTree.add(new TerminalExpressionOther());
//                    break;

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
