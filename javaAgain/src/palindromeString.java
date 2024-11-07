import java.util.Scanner;
public class palindromeString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to check if it's palindrome : ");
        String str = sc.next();

        String org_str = str;
        String rev = "";

        int len = str.length();

        for(int i = len-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }
        System.out.println("Reversed string : "+rev);

        if(org_str ==  str){
            System.out.println(rev+" it is palindrome");
        }
        else {
            System.out.println(rev+" it is not palindrome");
        }
    }
}
