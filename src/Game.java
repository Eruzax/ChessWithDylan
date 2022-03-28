import java.util.Scanner;

public class Game
{
    private Player player1;
    private Player player2;
    private Scanner scan = new Scanner(System.in);

    public void start()
    {
        System.out.println("Welcome to Chess!");
        System.out.println("Player 1 enter your name: ");
        String choice = scan.nextLine();
        player1 = new Player(choice);
        System.out.println("Player 2 enter your name: ");
        choice = scan.nextLine();
        player2 = new Player(choice);
    }


}