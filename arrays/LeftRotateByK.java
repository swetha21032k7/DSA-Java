package Arrays;
import java.util.Scanner;

public class LeftRotateByK {

    public static void leftRotateByK(int[] arr, int k) {

        int n = arr.length;

        k = k % n;

        int[] temp = new int[n];

        // Copy elements from k to end
        int index = 0;

        for (int i = k; i < n; i++) {
            temp[index] = arr[i];
            index++;
        }

        // Copy first k elements
        for (int i = 0; i < k; i++) {
            temp[index] = arr[i];
            index++;
        }

        // Copy temp array back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        leftRotateByK(arr, k);

        System.out.println("Array after left rotation:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}