package showroom;
import java.util.Scanner;
public class operations {
    public static void getTata(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for Nano\n Press 2 for Nexon");
        int ch = sc.nextInt();

        tata td = new tata();

        switch(ch){
            case 1:
                td.getNanoInfo();
                break;
            case 2:
                td.getNexonInfo();
                break;
            default:
                System.out.println("Invalid Option");
        }


    }
    public static void getBmw(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Press 1 for x1");
        int ch = sc.nextInt();

        bmw bw = new bmw();

        switch(ch){
            case 1:
                bw.getX1Info();
                break;
            default:
                System.out.println("Invalid Option");
                break;
        }
    }
}
