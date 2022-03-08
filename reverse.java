import java.util.Scanner;

public class reverse {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length+1; i++) {
           arr[i] = in.nextInt();
        }
        for(int i = arr.length-1; i >= 0; i--) {
           System.out.print(arr[i] + " ");
        }
        System.out.println();
        
    }
}
