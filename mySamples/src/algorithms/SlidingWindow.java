package algorithms;


// Если нужно найти самую длинную/короткую строку, подмассив или значение на их основе.
public class SlidingWindow {

    public int findMaxAverage(int[] arr, int range) {
        int currentWindowSum = 0;
        int maxWindowSum = 0;

        for (int rightSide = 0; rightSide < range; rightSide++) {
            currentWindowSum += arr[rightSide];
        }
        for(int rightSide = range; rightSide < arr.length; rightSide++){
            currentWindowSum += arr[rightSide] - arr[rightSide - range];
            maxWindowSum = Math.max(maxWindowSum, currentWindowSum);
        }
        return maxWindowSum/range;
    }

}
