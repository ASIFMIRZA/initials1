
import java.util.Scanner;
public class Initials {
    public static void main(String[] args) {
        String Fname = new String();
         String Lname = new String();
        System.out.println("PLEASE ENTER YOUR FIRST NAME: ");
        Scanner input = new Scanner(System.in);
        Fname = input.nextLine();
         Lname = input.nextLine();
        

        System.out.println("YOUR LAST NAME IS: " + Fname+Lname);
        String temp = new String(Fname.toLowerCase());
   String temp2 = new String(Lname.toLowerCase());
        System.out.println(temp+temp2);

        char A = Fname.charAt(0);
        System.out.println(A);
            
char L = Lname.charAt(0);
System.out.println(L);

        for (int i = 1; i < Fname.length(); i++) {
      
            
             for (int Li = 1; Li < Lname.length(); Li++) {
              
             }
               
                 if (L == '0') {
                System.out.println(Lname.charAt(L - 1));

            if (A == '0') {
                System.out.println(Fname.charAt(i - 1));
                
            }
        }
    }
}
}