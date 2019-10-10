package Interpreter.basic;

public class TerminalExpressionE extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("e")){
            context.output = context.output + "2";
            context.input = context.input.substring(1); // Elimina caracter interpretado
        }
    }
}
