import java.util.Scanner;
 public class EqualTargetFixedWindow{
  public static void main(String[] args){
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

 System.out.println("Enter target :");
 int target = sc.nextInt();

int count =0;
int sum = 0;
 
for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        if (sum == target) {
            count++;
        }

        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];

            if (sum == target) {
                count++;
            }
        }

        System.out.println(count);
    }
}