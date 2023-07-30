import java.util.Arrays;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] nums = {2,5,1,3,4,7};
        int start=0;
        int end = nums.length-1;
    /* int[] pyr  = buildArray(nums);
        System.out.println(Arrays.toString(pyr));*/
        int[] apk=shuffle(nums, start, end);
        System.out.println(Arrays.toString(apk));

    }
    /*static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;*/

    static int[] shuffle(int[] nums, int start, int end) {
        int mid = start + (end - start) / 2; // Add parentheses to ensure correct order of operations
        int[] arr = new int[nums.length];
        int k = 0; // Add a counter to keep track of the index in the new array
        for (int i = start; i <= mid; i++) {
            arr[k++] = nums[i];
            arr[k++] = nums[i + mid - start + 1];
        }
        return arr;

    }
}
