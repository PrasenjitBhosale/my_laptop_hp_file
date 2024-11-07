package showroom;
import java.util.Scanner;

public class car {
    static {
        System.out.println("Choose your Favourite car");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for Tata\n 2 for Toyota \n 3 for BMW");
        int ch = sc.nextInt();

        switch(ch){
            case 1:
                System.out.println("Welcome to TATA");
                operations.getTata();
                break;
            case 2:
                System.out.println("Welcome to Toyota ");

                break;
            case 3:
                System.out.println("Welcome to BMW");
                operations.getBmw();
                break;
        }
    }
}
