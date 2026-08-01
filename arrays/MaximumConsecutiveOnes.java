import java.util.Scanner;

public class MaximumConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] arr) {

        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                count++;

                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements (0 or 1):");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = findMaxConsecutiveOnes(arr);

        System.out.println("Maximum consecutive ones: " + result);

        sc.close();
    }
}