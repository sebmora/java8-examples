package com.sebmora.javaexamples.lambda.example2;

public class LambdaCalculator {

    public static void main(String[] args) {
        LambdaCalculator lambdaCalculator = new LambdaCalculator();

        System.out.printf("\n\tImperative average : %s \n", lambdaCalculator.average(5, 4));
        System.out.printf("\n\tFunctional average : %s \n", lambdaCalculator.averageL(5, 4));
    }

    public double average(double a, double b) {
        IAverage avg = new IAverage() {
            @Override
            public double calculate(double a, double b) {
                return (a + b) / 2;
            }
        };
        return avg.calculate(a, b);
    }


    public double averageL(double a, double b) {
        IAverage avg = (x, y) -> (x + y) / 2;
        return avg.calculate(a, b);
    }

}
