package com.kodilla.exeption.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(1, 1.5);
        } catch (Exception e) {
            System.out.println("Co jest źle:  " + e);
        } finally {
            System.out.println("Operacja się udała");
        }
    }
}
