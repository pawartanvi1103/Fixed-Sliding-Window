import java.util.Scanner;

public class FirstElementFixedWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size:");
  int n = sc.nextInt();
  int[] arr = new int[n];

  System.out.println("Enter array elemnt:");
  for(int i=0; i<n; i++){
  arr[i] = sc.nextInt();
}

 System.out.println("Enter window size :");
 int k = sc.nextInt();


        for (int i = 0; i <= n - k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}