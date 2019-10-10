package Interpreter.sintaxisGherkins;

import java.util.Arrays;

public class TerminalExpressionOther extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        String[] var = context.input.trim().split("\\s+");
      //  System.out.println(var[0]);
        if (var[0].equals("Como")){
            context.output = context.output + "Given ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length));
            //context.input = context.input.substring(1); // Elimina caracter interpretado
        }
        else if (var[0].equals("Quiero")){
            context.output = context.output + "When ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length)); // Elimina caracter interpretado
        }
        else if (var[0].equals("Para")){
            context.output = context.output + "Then ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length));// Elimina caracter interpretado
        }
        else {
            context.output= context.output + var[0]+" ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length));
        }

    }
}
