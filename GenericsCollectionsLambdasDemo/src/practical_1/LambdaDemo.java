package practical_1;

interface StringConcat {
    String concatenate(String a, String b);
}

public class LambdaDemo {
    public static void main(String[] args) {

        System.out.println("Shreya Patil");
        System.out.println("54");

        // Lambda Expression to concatenate two strings
        StringConcat obj = (a, b) -> a + b;

        String result = obj.concatenate("Hello ", "Java");

        System.out.println("Concatenated String: " + result);
    }
}