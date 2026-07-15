import java.util.Scanner;

public class LargestElement {

    public static int findLargest(int[] nums) {

        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] > largest) {
                largest = nums[i];
            }

        }

        return largest;
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

        int result = findLargest(nums);

        System.out.println("Largest Element: " + result);

        sc.close();
    }
}