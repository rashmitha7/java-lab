import java.util.Scanner;

public class twoSmallestNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int min1 = in.nextInt(), min2 = in.nextInt(), num;
        if (min1 > min2) {
            int temp = min1;
            min1 = min2;
            min2 = temp;
        }
        for (int i = 2; i < n; i++) {
            num = in.nextInt();
            if (num < min1) {
                min2 = min1;
                min1 = num;
            }
            else if (num < min2) {
                min2 =num;
            }
        }
        System.out.println(min1 + " " + min2);
    }
}