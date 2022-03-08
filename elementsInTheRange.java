import java.util.Scanner;

public class elementsInTheRange {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int min = in.nextInt();
        int max = in.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= min && arr[i] <= max) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}