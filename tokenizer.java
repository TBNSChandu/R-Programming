import java.util.ArrayList;
import java.util.List;

public class tokenizer {
    public static void main(String[] args) {
        String code1 = "if (input.endsWith(\"ed\")) { String stem = input.substring(0, input.length() - 2); String letterTypes = getLetterTypes(stem); if (letterTypes.contains(\"v\")) { return step1b2(stem); } return input; }";
        String code2 = "if (input.endsWith(\"ing\")) { String stem = input.substring(0, input.length() - 3); String letterTypes = getLetterTypes(stem); if (letterTypes.contains(\"v\")) { return step1b2(stem); } return input; }";

        List<String> tokens1 = tokenize(code1);
        List<String> tokens2 = tokenize(code2);

        System.out.println("Code Fragment 1 Tokens: " + tokens1);
        System.out.println("Code Fragment 2 Tokens: " + tokens2);

        boolean areIdentical = tokens1.equals(tokens2);
        System.out.println("Are the token sequences identical? " + areIdentical);
    }

    private static List<String> tokenize(String input) {
        List<String> tokens = new ArrayList<>();
        String[] splitTokens = input.split("\\s+");
        for (String token : splitTokens) {
            if (!token.isEmpty()) {
                tokens.add(token);
            }
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
