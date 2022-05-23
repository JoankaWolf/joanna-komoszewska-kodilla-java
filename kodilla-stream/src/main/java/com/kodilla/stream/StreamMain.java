package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        processor.execute(() -> System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();       // [5]

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, Double::sum);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String beautyText1 = poemBeautifier.beautify("Be happy", (text-> "AAA" +" "+ text +" " + "AAA"));
        System.out.println(beautyText1);
        String beautyText2 = poemBeautifier.beautify("Be happy", (text-> "ABC" +" "+ text +" " + "ABC"));
        System.out.println(beautyText2);
        String beautyText3 = poemBeautifier.beautify("Be happy", (text-> "New world is better," +" "+ text));
        System.out.println(beautyText3);
        String beautyText4 = poemBeautifier.beautify("Be happy", (text-> text.toUpperCase()));
        System.out.println(beautyText4);
        String beautyText5 = poemBeautifier.beautify("Be happy", (text-> text.replaceFirst("Be happy", "Be worry")));
        System.out.println(beautyText5);




    }
}
