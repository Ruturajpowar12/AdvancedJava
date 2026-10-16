package Practical1;

import java.util.function.BiFunction;

interface Max {
    public int checkMax(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        System.out.println("Ruturaj Powar");
        System.out.println("37");

        Max m = (a, b) -> (a > b) ? a : b;
        System.out.println("Max number : " + m.checkMax(80, 40));

        BiFunction<Integer, Integer, Integer> checkMax = (a, b) -> (a > b) ? a : b;
        int result = checkMax.apply(10, 20);
        System.out.println("Max number is : " + result);
    }
}