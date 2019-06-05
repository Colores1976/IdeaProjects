package com.kodilla.exeption.test;


    public class FirstChallenge {

        public double divide(double a, double b) throws ArithmeticException {
            if(b == 0){
                throw new ArithmeticException();
            }
            return a / b;
        }

        public static void main(String[] args) {

            FirstChallenge firstChallenge = new FirstChallenge();

            try {
                firstChallenge.divide(3, 0);
            } catch (ArithmeticException e) {
                System.out.println("Czemu to się nie drukuje" + e);
            } finally {
                System.out.println("Dziękujemy za skorzystanie z kalkulatora");
            }

           // System.out.println(result);

        }
    }