import java.util.Scanner;

public class Main
{
    // Executes an operation on two operands
    public static double executeOperation(double operand1, double operand2, String operator)
    {
        double result;

        switch (operator)
        {
            case "+": // If the operator is +, add the operands
                result = operand1 + operand2;
                break;
            case "-": // If the operator is -, subtract operand2 from operand1
                result = operand1 - operand2;
                break;
            case "*": // If the operator is *, multiply the operands
                result = operand1 * operand2;
                break;
            case "/": // If the operator is /, divide operand1 by operand2
                result = operand1 / operand2;
                break;
            default: // If the operator is not recognised, throw an error
                throw new UnsupportedOperationException();
        }
        return result;
    }

    // Checks if a string is numeric
    public static boolean isNumeric(String term)
    {
        boolean isNumeric = true;

        try // Tries parsing the string as a double
        {
            double number = Double.parseDouble(term);
        }
        catch (NumberFormatException e) // If there is an error, the string is not numeric
        {
            isNumeric = false;
        }
        return isNumeric;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Gets the expression from the user
        System.out.println("Enter expression: ");
        String expression = in.nextLine();

        String[] terms = expression.split(" "); // Splits the string by spaces
        int expressionLength = terms.length; // The length of the expression

        Stack operandStack = new Stack(expressionLength); // Creates an operand stack of maximum size expressionLength
        Stack operatorStack = new Stack(expressionLength); // Creates an operator stack of maximum size expressionLength

        for (String term : terms) // For each term in the expression
        {
            if (isNumeric(term)) // If the term is numeric, push the term to the operand stack
            {
                operandStack.push(term);
            }
            else if (term.equals("+") || term.equals("-") || term.equals("*") || term.equals("/")) // If the term is an operator, push the term to the operator stack
            {
                operatorStack.push(term);
            }
            else if (term.equals(")")) // If the term is a closing bracket, execute the operation on the previous two operands
            {
                double secondOperand = Double.parseDouble(operandStack.pop()); // Pops the topmost operand from the operand stack; this is the second operand due to the order of operation
                double firstOperand = Double.parseDouble(operandStack.pop()); // Pops the first operand from the operand stack
                String operation = operatorStack.pop(); // Pops the operator from the operator stack
                operandStack.push(String.valueOf(executeOperation(firstOperand, secondOperand, operation))); // Executes the operation on the two operands and pushes the result to the operand stack
            }
        }
        System.out.println(operandStack.pop()); // Prints the evaluated term
    }
}
