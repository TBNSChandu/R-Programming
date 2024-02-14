import java.util.*;

public class TextTransformation {
    public static void main(String[] args) {
        String code1 = " v ED " +
                "if input.endsWith ed " +
                "    String stem  input.substring 0, input.length - 2 "+
                "    String letterTypes  getLetterTypes stem "+
                "    if letterTypes.contains v " +
                "        return step1b2 stem "+
                "    return input ";

        String code2 = " v ING " +
                "if input.endsWith ing " +
                "    String stem  input.substring 0, input.length - 3" +
                "    String letterTypes  getLetterTypes stem " +
                "    if (letterTypes.contains v " +
                "        return step1b2 stem" +
                "    return input" ;

        String transformedTextCode1 = transformText(code1);
        String transformedTextCode2 = transformText(code2);

        List<String> tokensCode1 = tokenize(transformedTextCode1);
        List<String> tokensCode2 = tokenize(transformedTextCode2);

        
        System.out.println("Transformed Text Code 1: " + transformedTextCode1);
        System.out.println("Transformed Text Code 2: " + transformedTextCode2);

        System.out.println("\nTokenization");
        System.out.println("Code 1 Tokens: " + tokensCode1);
        System.out.println("Code 2 Tokens: " + tokensCode2);
    }

    private static String transformText(String code) {
        String transformedText = code.replaceAll("[^a-zA-Z\\s]", "");
        return transformedText;
    }

    private static List<String> tokenize(String input) {
        List<String> tokens = new ArrayList<>();
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext()) {
            tokens.add(scanner.next());
        }
        return tokens;
    }

    private static String getLetterTypes(String stem) {
        
        return "";
    }

    private static String step1b2(String stem) {
       
        return "";
    }
}
