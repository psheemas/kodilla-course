package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
        public static void main(String[] args) {
            ExpressionExecutor expressionExecutor = new ExpressionExecutor();

            System.out.println("Calculating expressions with lambdas");
            expressionExecutor.executeExpression(10,5,(a,b) -> a + b);
            expressionExecutor.executeExpression(10,5,(a,b) -> a - b);
            expressionExecutor.executeExpression(10,5,(a,b) -> a * b);
            expressionExecutor.executeExpression(10,5,(a,b) -> a / b);

            System.out.println("Calculating expressions with method references");
            expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
            expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
            expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
            expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

            PoemBeautifier poemBeautifier = new PoemBeautifier();
            poemBeautifier.beautify("decorate",(decoratePoem -> "ABC"+decoratePoem+"ABC"));
            poemBeautifier.beautify("decorate",(decoratePoem -> decoratePoem.toUpperCase()));
            poemBeautifier.beautify("decorate",(decoratePoem -> new StringBuilder(decoratePoem).reverse().toString()));
            poemBeautifier.beautify("decorate",(decoratePoem -> decoratePoem.replaceAll(".(?!$)", "$0 ")));
        }
}
