import java.util.Scanner;
public class ReverseInteger { 
        // TODO: Read an integer and print its reverse  
        public static void main (String args[]){
                Scanner sc =  new Scanner(System.in);
                int n = sc.nextInt();
                int rev_num =0;
                while(n>0){
                        rev_num = rev_num*10 + n%10;
                        n/=10;
                }
                System.out.println(rev_num);
        }
}
