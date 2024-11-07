import java.sql.SQLException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
//        int arr[] = new int[5];
//
//        try{
//            System.out.println("I'm in first try block !!!");
//            try{
//                arr[6] = 10;
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//

//        *****************************

        int age = sc.nextInt();
        if(age<18){
            throw new RuntimeException("Sorry You Cant vote");
        }else{
            System.out.println("You are eligible to vote");
        }


    }
}
