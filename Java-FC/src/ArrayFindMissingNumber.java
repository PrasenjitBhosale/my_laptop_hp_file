public class ArrayFindMissingNumber {
    public static void main(String args[]){


        // array should not have duplicate
        // array no need to be sorted order

        int a[] = { 1, 2, 4, 5 };
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            sum1 = sum1 + a[i];
        }
        System.out.println("Sum of array is : " + sum1);

        int sum2 = 0;
        for (int i = 1; i <= a.length + 1; i++) { // changed a.length to a.length + 1
            sum2 = sum2 + i;
        }
        System.out.println("Sum of range of elements in array : " + sum2);

        System.out.println("Missing number is : " + (sum2 - sum1));

    }
}
