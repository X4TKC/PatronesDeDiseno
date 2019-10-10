package Interpreter.basic;

public class TerminalExpressionU extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("u")){
            context.output = context.output + "5";
            context.input = context.input.substring(1); // Elimina caracter interpretado
        }
    }
}
