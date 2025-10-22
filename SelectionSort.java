import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {6,4,3,5,1,2};
        int n = numbers.length;
        int placeholder = -1;

        for (int i = 0; i < (n-1); i++){
            int minIndex = i;
            for (int j = i + 1; j < n; j++){
                if (numbers[j] < numbers[minIndex]){
                    minIndex = j;
                }
            }
            placeholder = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = placeholder;
            System.out.println(Arrays.toString(numbers));
        }
    }
}
