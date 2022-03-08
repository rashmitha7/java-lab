import java.util.Scanner; 

public class adjustListByNormalizing {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; ++i) {
            arr[i] = scanner.nextInt();
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print((arr[i] - min) + " ");
        }
        System.out.println();
   }
}