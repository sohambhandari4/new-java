import java.util.Arrays;

class CricketPlayer {
    String name;
    int noOfInnings;
    int noOfTimesNotOut;
    int totalRuns;
    double batAvg;

    public CricketPlayer(String name, int noOfInnings, int noOfTimesNotOut, int totalRuns) {
        this.name = name;
        this.noOfInnings = noOfInnings;
        this.noOfTimesNotOut = noOfTimesNotOut;
        this.totalRuns = totalRuns;
        this.batAvg = avg(totalRuns, noOfInnings - noOfTimesNotOut);
    }

    public static double avg(int totalRuns, int totalInnings) throws ArithmeticException {
        if (totalInnings == 0) {
            throw new ArithmeticException("Cannot calculate average: Division by zero");
        }
        return (double) totalRuns / totalInnings;
    }

    public static void sortPlayer(CricketPlayer[] players) {
        Arrays.sort(players, (a, b) -> Double.compare(b.batAvg, a.batAvg));
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("No. of Innings: " + noOfInnings);
        System.out.println("No. of Times Not Out: " + noOfTimesNotOut);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Batting Average: " + batAvg);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        CricketPlayer[] players = {
            new CricketPlayer("Player1", 20, 5, 800),
            new CricketPlayer("Player2", 25, 8, 1200),
            new CricketPlayer("Player3", 18, 3, 600)
        };

        CricketPlayer.sortPlayer(players);

        for (CricketPlayer player : players) {
            player.display();
        }
    }
}
