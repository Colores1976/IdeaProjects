package com.kodilla.exeption.test;

import java.io.IOException;

public class FirstChallenge {

    public double divide(double a, double b) {

       try {
        } catch (ArithmeticException e) {
        System.out.println("Czemu to się nie drukuje" + e);
        } finally {
            System.out.println("Dziękujemy za skorzystanie z kalkulatora");
        }
    return a/b;
    }


    public static void main(String[] args){
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
        System.out.println();
        System.out.println(result);
    }
}
