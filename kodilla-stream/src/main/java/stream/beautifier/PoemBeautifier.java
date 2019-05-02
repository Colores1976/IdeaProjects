package stream.beautifier;

import static java.lang.Character.toUpperCase;

public class PoemBeautifier{
    public void beautify(String toDecorate, String decorator, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(toDecorate, decorator);
        System.out.println(result);
    }
    public static String toDecorateToUpperCase(String toDecorate, String decorator){
        return toDecorate.toUpperCase();
    }
    public static String joinDecoration(String toDecorate, String decorator){
        return toDecorate.join(":)", toDecorate, decorator);
    }
}
