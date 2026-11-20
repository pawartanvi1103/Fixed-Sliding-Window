import java.util.Scanner;
 public class MaxSumFixedWindow{
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

 int sum = 0;
 for(int i =0; i<k; i++){
 sum = sum + arr[i];
}

 int max = sum;

 for(int i=k; i<n; i++){
 sum = sum - arr[i - k] + arr[i];
 
 if(sum > max){
  max = sum;
  }
}

 System.out.println(max);

}
}