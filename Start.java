import java.util.Scanner;

public class Start {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Game! Please enter your name:");
        String playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "! Are you ready to start the game? (yes or no)");
        String startGame = scanner.nextLine();

        if (startGame.equals("yes")) {
            System.out.println("Click on Start to start game!");
            // start the game
//            Game game = new Game(playerName);
//            game.start();
        } else {
            System.out.println("Ok, see you later!");
        }
    }
}
