import java.util.HashMap;
import java.util.Map;

public class ASTVectorRepresentation {
    public static void main(String[] args) {

       String astCode1 = "(if (endsWith input \"ed\") (block (assign stem (substring input 0 (- (length input) 2))) (assign letterTypes (getLetterTypes stem)) (if (contains letterTypes \"v\") (return (step1b2 stem)) (return input))))";
	   String astCode2 = "(if (endsWith input \"ing\") (block (assign stem1 (substring input 0 (- (length input) 3))) (assign letterTypes1 (getLetterTypes stem1)) (if (contains letterTypes1 \"v\") (return (step1b2 stem1)) (return input))))";

        Map<String, Integer> vectorCode1 = createVector(astCode1);
        Map<String, Integer> vectorCode2 = createVector(astCode2);

        System.out.println("Code 1 Vector: " + vectorCode1);
        System.out.println("Code 2 Vector: " + vectorCode2);
    }

    private static Map<String, Integer> createVector(String ast) {
        Map<String, Integer> vector = new HashMap<>();

        String[] nodes = ast.split(" ");

        for (String node : nodes) {
            vector.put(node, vector.getOrDefault(node, 0) + 1);
        }

        return vector;
    }
}
