// insert C B B D B C A X as Program argument in Configuration

public class QuizGrader {

    private static final int result = 5;

    enum Result {
        CORRECT, WRONG, UNANSWERED;
    }
    private static final String [] correctAnswer = {"C","A","B","D","B","C","C","A"};

    public static void main(String[]  args) {
        int noOfCorrect = 0;
        int noOfWrong = 0;
        int noOfUnanswered = 0;

        System.out.println("Question    Submitted Ans.    Correct Ans.    Result");

        for (int i = 0; i < correctAnswer.length; i++) {
            if (args[i].equals(correctAnswer[i])) {
                System.out.printf("%3s %12s %18s %16s%n", i+1, args[i], correctAnswer[i], Result.CORRECT);
                noOfCorrect++;
            } else if (args[i].equals("X")) {
                System.out.printf("%3s %12s %18s %16s%n", i+1, args[i], correctAnswer[i], Result.UNANSWERED);
                noOfUnanswered++;
            } else {
                System.out.printf("%3s %12s %18s %16s%n", i+1, args[i], correctAnswer[i], Result.WRONG);
                noOfWrong++;
            }
        }

        System.out.printf("No. of correct answers: %8s%n", noOfCorrect);
        System.out.printf("No. of wrong answers: %10s%n", noOfWrong);
        System.out.printf("No. of questions unanswered: %3s%n", noOfUnanswered);
        System.out.printf("The candidate %s.", noOfCorrect >= result ? "PASSED" : "FAILED");

    }

}

