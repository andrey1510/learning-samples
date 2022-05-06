package level8;

//https://www.codewars.com/kata/5601409514fc93442500010b/train/java

public class HowGood {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int classPoint : classPoints){ // for (int i = 0; i < classPoints.length; i++)
            sum += classPoint;  // sum = sum + classPoints[i];
        }
        int average = sum / classPoints.length;
        return average < yourPoints;        // simplified if-else
    }

    public static void main(String[] args) {                        //tests
        System.out.println(betterThanAverage(new int[] {2, 3}, 12));
        System.out.println(betterThanAverage(new int[] {11, 14}, 12));
    }

}
