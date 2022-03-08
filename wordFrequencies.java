import java.util.Scanner; 

public class wordFrequencies {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       String strArray[] = new String[n];
        
       for (int i = 0; i < n; i++) {
           strArray[i] = sc.next();
       }
       int countArray[] = new int[n];
       int count;
       
       for (int i = 0; i < countArray.length; i++) {
           count = 0;
           for (int j = 0; j < countArray.length; j++) {
               if (strArray[i].equals(strArray[j])) {
                   count++;
               }
           }
           countArray[i] = count;
       }
       for (int i = 0; i < strArray.length; i++) {
           System.out.println(strArray[i] + " " + countArray[i]);
       }
        
   }
}
