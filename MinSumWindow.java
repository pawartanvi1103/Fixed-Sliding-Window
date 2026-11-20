import java.util.Scanner;

public class MinSumWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 2;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        int min = sum;

        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];

            if (sum < min) {
                min = sum;
            }
        }

        System.out.println(min);
    }
}