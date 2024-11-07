package polymorph;

public class method_overloading_compileTime {
    public void m1(){
        System.out.println("No parameter");
    }
    public void m1(int a){
        System.out.println("integer parameter");
    }
    public void m1(int a,int b){
        System.out.println("inter 2 parameters");
    }



    public static void main(String[] args) {
        method_overloading_compileTime obj = new method_overloading_compileTime();
        obj.m1();
        obj.m1(10);
        obj.m1(10,20);

    }
}
