package Interpreter.basic;

public class TerminalExpressionOther extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("*")){
            context.output = context.output + "10";
            context.input = context.input.substring(1); // Elimina caracter interpretado
        }
    }
}
