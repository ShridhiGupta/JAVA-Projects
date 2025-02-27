import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-----------------");
            System.out.println("NEW GAME");
            System.out.println("-----------------");
            int turns = 5;
            int s = 1;
            int e = 100;
            int number = (int)(Math.random() * (e - s + 1) + s);
            while(turns > 0){
                System.out.println("pick a number between " + s + "-" + e + "! You will get " + turns + " turns");
                int guess = scanner.nextInt();
                System.out.println("player guesses " + guess);
                if(guess == number){
                    System.out.println("YOU WIN! The SECRET number was " + number);
                    break;
                }
                else if(guess < number){
                    System.out.println("Sorry, that number is too low");
                    s = guess + 1;
                }
                else{
                    System.out.println("Sorry, that number is too high");
                    e = guess - 1;
                }
                turns--;
            }
            if(turns == 0){
                System.out.println("GAME OVER! The correct number was " + number);
            }
            System.out.println("Do you want to play again? (yes/no)");
            scanner.nextLine(); // Consume leftover newline
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
        scanner.close();
    }
}
