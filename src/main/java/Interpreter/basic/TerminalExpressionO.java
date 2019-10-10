package Interpreter.basic;

public class TerminalExpressionO extends AbstractExpresion {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("o")){
            context.output = context.output + "4";
            context.input = context.input.substring(1); // Elimina caracter interpretado
        }
    }
}
