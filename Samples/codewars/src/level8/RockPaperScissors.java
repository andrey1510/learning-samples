package level8;//https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals("rock") && (p2.equals("scissors"))) {
            return "Player 1 won!";
        }
        else if (p1.equals("scissors") && (p2.equals("rock"))) {
            return "Player 2 won!";
        }
        else if (p1.equals("paper") && (p2.equals("rock"))) {
            return "Player 1 won!";
        }
        else if (p1.equals("rock") && (p2.equals("paper"))) {
            return "Player 2 won!";
        }
        else if (p1.equals("scissors") && (p2.equals("paper"))) {
            return "Player 1 won!";
        }
        else if (p1.equals("paper") && (p2.equals("scissors"))) {
            return "Player 2 won!";
        }
        else return "Draw!";
    }

    public static void main(String[] args) {
        System.out.println(rps("paper","scissors"));        //tests
        System.out.println(rps("paper","paper"));
    }

}
