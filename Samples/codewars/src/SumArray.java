public class SumArray {

    public static double sum(double[] numbers) {
        double sum = 0;
        //check if empty
//        if (numbers.length == 0) {
//            return 0;
//        }


        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(new double[]{1, 2, 3}));
        System.out.println(sum(new double[]{}));
    }


}
