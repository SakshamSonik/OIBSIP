import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame{
    int number;
    public NumberGuessingGame(){
        Random rand = new Random();
        number = rand.nextInt(100);
        System.out.println("Guess the Number Form  1 to 100");
    }
    public int computerNo(){
        return number;
    }
}
public class GuessTheNumber {
    static int UserInput() {
        int user;
        System.out.println("Enter ");
        Scanner sc = new Scanner(System.in);
        user = sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j) {
        if (i == j) {
            System.out.println("Correct. You guessed the correct number");
        }
        else if (i > j) {
            System.out.println("Your number is Big than computer number");
        }
        else {
            System.out.println("Your number is Small than computer number");
        }
    }

    public static void main(String[] args) {
        int user = 0, computer = 0, itteration = 0;
        NumberGuessingGame g = new NumberGuessingGame();
        do {
            user = UserInput();
            computer = g.computerNo();

            isCorrectNumber(user, computer);
            itteration++;
        }
        while (user != computer);
        System.out.println("You guessed the number in " + itteration + " itterations");
    }
}