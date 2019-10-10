package Interpreter.RomanNumbers;

import java.util.Arrays;

public class TerminalExpressionOther extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {
        String[] var = context.input.trim().split("\\s+");
      //  System.out.println(var[0]);
        if (var[0].equals("I")){
            context.output = context.output + "1 ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length));
            //context.input = context.input.substring(1); // Elimina caracter interpretado
        }
        else if (var[0].equals("II")){
            context.output = context.output + "2 ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length)); // Elimina caracter interpretado
        }
        else if (var[0].equals("III")){
            context.output = context.output + "3 ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length));// Elimina caracter interpretado
        }
        else if (var[0].equals("IV")){
            context.output = context.output + "4 ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length));// Elimina caracter interpretado
        }
        else if (var[0].equals("V")){
            context.output = context.output + "5 ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length));        }
        else if (var[0].equals("VI")){
            context.output = context.output + "6 ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length));        }
        else if (var[0].equals("VII")){
            context.output = context.output + "7 ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length));        }
        else if (var[0].equals("VIII")){
            context.output = context.output + "8 ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length));        }
        else if (var[0].equals("IX")){
            context.output = context.output + "9 ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length));        }
        else if (var[0].equals("X")){
            context.output = context.output + "10 ";
            context.input=String.join(" ",Arrays.copyOfRange(var,1,var.length));        }
    }
}
