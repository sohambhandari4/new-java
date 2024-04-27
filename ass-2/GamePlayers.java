/*Write a package game which will have 2 classes Indoor and Outdoor.Use a function display to generate the 
list of player for the specific game.use default and parametrized constructor*/
// Importing necessary packages
import java.util.*;

// Define the GamePlayers class
public class GamePlayers {
    // Define the Indoor class
    public static class Indoor {
        // Data members
        private String gameName;
        private String[] players;

        // Default constructor
        public Indoor() {
            // Initialize game name and players array with default values
            this.gameName = "Indoor Game";
            this.players = new String[]{"Player 1", "Player 2", "Player 3"};
        }

        // Parameterized constructor
        public Indoor(String gameName, String[] players) {
            // Initialize game name and players array with provided values
            this.gameName = gameName;
            this.players = players;
        }

        // Method to display players for indoor game
        public void display() {
            // Display the name of the game
            System.out.println(gameName + " Players:");
            // Display the list of indoor players
            for (String player : players) {
                System.out.println(player);
            }
        }
    }

    // Define the Outdoor class
    public static class Outdoor {
        // Data members
        private String gameName;
        private String[] players;

        // Default constructor
        public Outdoor() {
            // Initialize game name and players array with default values
            this.gameName = "Outdoor Game";
            this.players = new String[]{"Player A", "Player B", "Player C"};
        }

        // Parameterized constructor
        public Outdoor(String gameName, String[] players) {
            // Initialize game name and players array with provided values
            this.gameName = gameName;
            this.players = players;
        }

        // Method to display players for outdoor game
        public void display() {
            // Display the name of the game
            System.out.println(gameName + " Players:");
            // Display the list of outdoor players
            for (String player : players) {
                System.out.println(player);
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create objects of Indoor and Outdoor classes with default constructors
        Indoor indoorDefault = new Indoor();
        Outdoor outdoorDefault = new Outdoor();

        // Display indoor and outdoor players with default constructors
        indoorDefault.display();
        outdoorDefault.display();

        // Create objects of Indoor and Outdoor classes with parameterized constructors
        String[] indoorPlayers = {"Player X", "Player Y", "Player Z"};
        String[] outdoorPlayers = {"Player P", "Player Q", "Player R"};
        Indoor indoorParam = new Indoor("Custom Indoor Game", indoorPlayers);
        Outdoor outdoorParam = new Outdoor("Custom Outdoor Game", outdoorPlayers);

        // Display indoor and outdoor players with parameterized constructors
        indoorParam.display();
        outdoorParam.display();
    }
}


