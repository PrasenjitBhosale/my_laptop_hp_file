import java.util.Scanner;
public class test1 {
    public static void main(String args[]){

        // hackerrank if-else
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String ans = "";


        if(n%2==1){
            ans="Weird";
        }
        else{

            if(n>=6 && n<=20){
                ans = "Not Weird";
            }
            else {
                ans = "Weird";
            }
        }

        System.out.println(ans);


    }
}
