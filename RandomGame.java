import java.util.Scanner;

public class RandomGame {

    public static void main(String[] args) {
        Scanner getinput = new Scanner(System.in);

        
        int randomNum = (int) (Math.random() * 10) + 1;

        System.out.println("Guess a number between 1 and 10:");
        int getNum = getinput.nextInt();

        if (randomNum == getNum) {
            System.out.println("Congratulations! You guessed it right.");
        } else {
            System.out.println("Oops, it is not the same.");
            System.out.println("The random number was: " + randomNum);
        }

        getinput.close();
    }
}
