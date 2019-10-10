package PrimerParcial.interpreter;

import java.util.Arrays;

public class TerminalExpressionOther extends AbstractExpresion {
    @Override
    public void interpreter(Context context) {


      //  System.out.println(var[0]);
       // if (var[0].equals("1")){
        // System.out.println(context.output);
            if(context.output.equals("")) {
                String[] var = context.input.trim().split("\\+");
                System.out.println(Arrays.toString(var));
                int variable = Integer.parseInt(var[0]);

                context.output = variable + "";

                context.input = String.join(" ", Arrays.copyOfRange(var, 1, var.length));

            }
            else{

                String[] var = context.input.trim().split("\\s+");

                int variable = Integer.parseInt(context.output) + Integer.parseInt(var[0]);

                context.output = variable + "";
                context.input = String.join(" ", Arrays.copyOfRange(var, 1, var.length));

            }


    }
}
