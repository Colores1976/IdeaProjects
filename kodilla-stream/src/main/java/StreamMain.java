import lambda.ExpresionExecutor;
import stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args){
        ExpresionExecutor expresionExecutor = new ExpresionExecutor();
        expresionExecutor.executeExpression(10,5, ((a, b) -> a + b));
        expresionExecutor.executeExpression(10, 5, ((a, b) -> a - b));
        expresionExecutor.executeExpression(10,5, ((a, b) -> a * b));
        expresionExecutor.executeExpression(10, 5, ((a, b) -> a / b));

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Na górze róże, na dole fiołki", " ''ABC'' ", ((toDecorate, decorator) -> decorator + toDecorate + decorator));
        poemBeautifier.beautify("Na górze róże, na dole fiołki","" , PoemBeautifier::toDecorateToUpperCase);
        poemBeautifier.beautify("Na górze róże, na dole fiołki ", " Kochajmy się jak dwa aniołki", PoemBeautifier::joinDecoration);
    }
}
