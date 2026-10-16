
package practical_1;

interface StringLength {
    int findLength(String str);
}

public class LambdaLength {
    public static void main(String[] args) {

        System.out.println("Shreya Patil");
        System.out.println("54");

        // Lambda expression to find string length
        StringLength obj = str -> str.length();

        String text = "Hello Java";

        System.out.println("String: " + text);
        System.out.println("Length of String: " + obj.findLength(text));
    }
}
