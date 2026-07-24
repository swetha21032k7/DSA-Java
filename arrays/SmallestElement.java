package Arrays;
import java.util.Scanner;

public class SmallestElement {

    public static int findSmallest(int[] nums) {

        int smallest = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < smallest) {
                smallest = nums[i];
            }

        }

        return smallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findSmallest(nums);

        System.out.println("Smallest Element: " + result);

        sc.close();
    }
}