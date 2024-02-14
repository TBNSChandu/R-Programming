import java.util.*;

public class VectorRepresentation {
    public static void main(String[] args) {
        String code1 = "if (input.endsWith(\"ed\")) { String stem = input.substring(0, input.length() - 2); String letterTypes = getLetterTypes(stem); if (letterTypes.contains(\"v\")) return step1b2(stem); return input; }";
        String code2 = "if (input.endsWith(\"ing\")) { String stem = input.substring(0, input.length() - 3); String letterTypes = getLetterTypes(stem); if (letterTypes.contains(\"v\")) return step1b2(stem); return input; }";

        List<String> tokens1 = tokenize(code1);
        List<String> tokens2 = tokenize(code2);

        System.out.println("Code 1 Tokens: " + tokens1);
        System.out.println("Code 2 Tokens: " + tokens2);

        Map<String, Integer> vector1 = createVector(tokens1);
        Map<String, Integer> vector2 = createVector(tokens2);

        System.out.println("Code 1 Vector: " + vector1);
        System.out.println("Code 2 Vector: " + vector2);
    }

    private static List<String> tokenize(String input) {
        List<String> tokens = new ArrayList<>(Arrays.asList(input.split("\\s+|(?<=[^\\w\\s])|(?=[^\\w\\s])")));
        tokens.removeIf(String::isEmpty);
        return tokens;
    }

    private static Map<String, Integer> createVector(List<String> tokens) {
        Map<String, Integer> vector = new HashMap<>();
        for (String token : tokens) vector.put(token, vector.getOrDefault(token, 0) + 1);
        return vector;
    }

    private static String getLetterTypes(String stem) {
        return "";
    }

    private static String step1b2(String stem) {
        return "";
    }
}
