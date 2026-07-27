import java.util.Scanner;

public class FindMissingNumber {

    public static int findMissingNumber(int[] arr) {

        int n = arr.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements (from 0 to " + n + " with one missing):");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = findMissingNumber(arr);

        System.out.println("The missing number is: " + missing);

        sc.close();
    }
}