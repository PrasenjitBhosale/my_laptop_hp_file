package exceptionDemo;

public class demo {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try{
              b = 10/b;
        }catch(Exception e){
            System.out.println("something went wrong");
        }


        System.out.println(b);
        System.out.println("bye");
    }
}
