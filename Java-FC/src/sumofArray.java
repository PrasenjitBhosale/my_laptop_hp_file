import java.util.Scanner;

public class sumofArray {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int arr[] = { 2,4,3,4};
        int sum = 0;

        System.out.println("Enter arr: ");

        for(int i=0;i<arr.length-1;i++){
            sum = sum + arr[i];
        }
        System.out.println(" "+sum);

    }
}


















