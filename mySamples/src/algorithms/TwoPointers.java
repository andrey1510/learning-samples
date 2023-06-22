package algorithms;

// Подходит для решения задач, где упоминаются отсортированные массивы (или связные списки), связанные с парами/тройками значений или подмассивами.
public class TwoPointers {

    // Two pointers: one input, opposite ends
    // Левый указатель указывает на начало массива, а правый на его конец.
    // Если их сумма равна целевому значению, то выдается результат.
    // Если сумма больше целевого значения, то правый указатель сдвигается левее
    // Если сумма меньше целевого значения, то мы левый указатель сдвигается правее
    public static boolean isPairSum(int[] arr, int sum) {       //finds if there is a pair in array with a given sum.
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        // Arrays.sort(arr);       // нужно, если массив не упорядочен и если не нужна выдача конкретных элементов.

        while (leftPointer < rightPointer) {
            if (arr[leftPointer] + arr[rightPointer] == sum) {      // pair found
                return true;
            } else if(arr[leftPointer] + arr[rightPointer] < sum) {  //move towards higher values if sum of elements at current pointers is less
                leftPointer++;
            } else {  //we move towards lower values if sum of elements at current pointers is more
                rightPointer--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPairSum(new int[]{2, 3, 5, 8, 9, 10, 11}, 113));
    }

}
