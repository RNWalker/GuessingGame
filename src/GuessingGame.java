public class GuessingGame {
    public static void main(String[] args) {
//Create two variables
//secretNumber to represent the secret number
//guess to represent the user's guess
//Give the variables any value you like
//Use conditional logic to compare the numbers and print an appropriate message
//Tell the user if their guess is correct
//Tell the user if their guess is too high
//Tell the user if their guess is too low
//Test your logic by changing the value of guess and re-running the program.

        int secretNumber = 5;
        int guess = 5;

        if (secretNumber > guess) {
            System.out.println("too low!");
        } else if (secretNumber < guess) {
            System.out.println("too high!");
        } else {
            System.out.println("correct!");
        }
    }
}
