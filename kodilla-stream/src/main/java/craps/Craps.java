package craps;

import java.security.SecureRandom;

public class Craps {
    private static final SecureRandom randomNumbers = new SecureRandom();
    // TYp enum ze stałymi reprezentującymi stan gry
    private enum Status {DALEJ, WYGRANA, PRZEGRANA};
    // Stałe reprezentujące typowe sumy rzutów kostakami
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args){
        int myPoint = 0; //Punkt jeśli nie było przegranej lub wygranej w pierwszym rzucie
        Status gameStatus; // może zawierać DALEJ, WYGRANA PRZEGRANA
        int sumOfDice = rollDice(); //pierwszy rzut kosztką

        switch (sumOfDice){
            case SEVEN: //wygrana w przypadku 7 w pierwszym rzucie
            case YO_LEVEN: // wygrana w przypadku 11 w pierwszym rzucie
                gameStatus = Status.WYGRANA;
                break;
            case SNAKE_EYES: //przegrana w przypadku 2 w pierwszym rzucie
            case TREY: // przegrana w przypadku 3 w pierwszym rzucie
            case BOX_CARS:// przegrana w przypadku 12 w pierwszym rzucie
                gameStatus = Status.PRZEGRANA;
                break;
                default:// nie ma wygranej lub przegranej zapamiętaj punkt
                    gameStatus = Status.DALEJ;
                    myPoint = sumOfDice;
                    System.out.printf("Punkt to %d%n", myPoint);
                    break;
        }
        // Jeśli gra się jeszcze nie skończyła
        while (gameStatus == Status.DALEJ){
            sumOfDice = rollDice(); // ponownie rzuć kostkami
        // Określ stan gry
            if(sumOfDice == myPoint){
                gameStatus = Status.WYGRANA;
            }
            else {
                if (sumOfDice == SEVEN ) {
                    gameStatus = Status.PRZEGRANA;
                }
            }
        }
    if (gameStatus == Status.WYGRANA){
    System.out.println("Gracz wygrał");
}
    else {
        System.out.println("Gracz przegrał");
    }
    }
    public static int rollDice(){
        //wybierz losowe wartości dla kostek
        int die1 = 1 + randomNumbers.nextInt(6);
        int die2 = 1 + randomNumbers.nextInt(6);
        int sum = die1 + die2;

        System.out.printf("Gracz wyrzucił %d + %d = %d%n", die1, die2, sum);
        return sum;
    }
}
