import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 8, 6, 3, 9, 2, 1, 7};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    private static  void  sort(int[] arr) {
     
        boolean isSwapped = true;
        for (int i = 0; i < arr.length - 1; ++i) {
            if (!isSwapped) return;
            isSwapped = false;
            for (int j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    isSwapped = true;
                    exchange(arr, j, j + 1);
                }
            }
        }
    }
    private static void exchange(int[] nums, int i ,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}