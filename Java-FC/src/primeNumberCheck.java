// Natural number > 1
//which has only 2 factors 1 and itself

// 19 =>  1 and 19  = > Prime number
// 28 = > 1,2,4,5,14,28 => Not a Prime number
public class primeNumberCheck {
    public static void main(String args[]){

        int num = 3;
        int count = 0;

        if(num > 1){
            for(int i=1;i<=num;i++){
                if(num % i == 0){
                    count= count+1;
                }

            }
            if(count ==2){
                System.out.println("Prime Number");
            }
            else{
                System.out.println("Not a Prime number");
            }


        }else{
            System.out.println("Not a Prime Number");
        }


    }
}
