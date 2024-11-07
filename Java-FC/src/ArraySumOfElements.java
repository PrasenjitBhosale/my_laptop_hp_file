public class ArraySumOfElements {
    public static void main(String args[]){


        int a[] = {2,3,4,6,1};

        int sum =0;

        for(int i=0;i<a.length;i++){
           sum = sum + a[i]  ;// 2 3 5 6 1
        }
        System.out.println("sum of Array Elements : "+sum);

    }
}
