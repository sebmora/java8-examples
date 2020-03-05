package com.sebmora.javaexamples.lambda.example1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaOrder {

    public static void main(String[] args) {
        LambdaOrder app = new LambdaOrder();
        List<String> list1 = getNewList("One", "Two", "Three", "Four");
        List<String> list2 = getNewList("One", "Two", "Three", "Four");

        app.order(list1);
        app.orderLambda(list2);
    }

    private static List<String> getNewList(String... strings) {
        return Arrays.stream(strings).collect(Collectors.toList());
    }


    // Imperative Paradigm Way
    public void order(List<String> list) {
        System.out.printf("\nunordered : %s", list);
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String text1, String text2) {
                return text1.compareTo(text2);
            }
        });
        System.out.printf("\nImperative Ordered : %s \n\n", list);
    }

    // Functional Paradigm Way
    public void orderLambda(List<String> list) {
        System.out.printf("\nunordered : %s", list);
        Collections.sort(list, (t1, t2) -> t1.compareTo(t2));
        System.out.printf("\nFunctional Ordered : %s", list);
    }
}
