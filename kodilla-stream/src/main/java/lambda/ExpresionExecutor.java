package lambda;

public class ExpresionExecutor {
    public void executeExpression(double a, double b, MathExpresion mathExpresion){
        double result = mathExpresion.calculateExpresion(a, b);
        System.out.println("Result equals: " + result);
    }
}
