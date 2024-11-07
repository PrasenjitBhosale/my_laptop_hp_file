import java.util.Random;

public class RandomNumGeneration {
    public static void main(String args[]){

        Random rand = new Random();

        int rand_num = rand.nextInt(10);

        System.out.println(rand_num);
        // // //
        // // //
        double rand_db1 = rand.nextDouble();  // 0.0 and less than 1.0
        System.out.println(rand_db1);
        //


    }
}
