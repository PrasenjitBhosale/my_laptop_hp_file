import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        int count = 0;

        if(num > 1){
            for (int i=1;i<=num;i++){
                if(num%i==0){
                   count = count + 1;
                }
            }
            if(count == 2){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not prime Number");
            }
        }
        else {
            System.out.println("Not prime number");

        }
    }
}
