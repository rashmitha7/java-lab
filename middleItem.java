import java.util.Scanner; 

public class middleItem {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String inp = sc.nextLine();
      String[] tokens = inp.split(" ");
      int[] numbers = new int[tokens.length];
      for( int i=0;i<numbers.length;i++){
         numbers[i]=Integer.parseInt(tokens[i]);
      }
      int n = numbers.length;
      if(n>9){
         System.out.println("Too many Outputs");
         return;
      }
      if (n % 2 == 1) {
         System.out.println(numbers[n / 2]);
      }
      else {
         System.out.println(numbers[(n - 1) / 2] + " " + numbers[n / 2]);
      }
   }
}
