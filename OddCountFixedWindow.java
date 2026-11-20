import java.util.Scanner;
 public class OddCountFixedWindow{
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

 int count = 0;

 for(int i=0; i<k; i++){
  if(arr[i] % 2 != 0){
  count++;
 }
}

  System.out.print(count + " ");
  for(int i=k; i<n; i++){
  if(arr[i - k] % 2 != 0){
  count--;
}

  if(arr[i] % 2 != 0){
  count++;
}


System.out.println(count + " ");
}
}
}