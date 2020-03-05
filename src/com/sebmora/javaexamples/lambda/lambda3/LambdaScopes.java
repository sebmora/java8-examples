package com.sebmora.javaexamples.lambda.lambda3;

public class LambdaScopes {

    private static double d = 3;

    public static void main(String[] args) {
        double c = 5;
        IOperation operation = (a, b) -> {
            return a + b + c + d;
        };
        System.out.println(operation.calculate(2, 4));
    }
}
