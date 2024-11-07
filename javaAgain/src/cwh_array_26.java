import java.util.Scanner;
public class cwh_array_26 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);



        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int org_num = num;

        int rev = 0;

        while(num!=0){
            rev = rev * 10 + num % 10 ;
            num = num / 10 ;
        }
        System.out.println("Reversed number is : "+ rev);

        if(org_num==num){
            System.out.println(rev+" is a palindrome.");
        }else{
            System.out.println(rev+" is not a palindrome.");
        }



    }
}
