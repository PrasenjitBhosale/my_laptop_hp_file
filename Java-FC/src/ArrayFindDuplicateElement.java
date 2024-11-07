public class ArrayFindDuplicateElement {
    public static void main(String args[]){

        String arr[] = {"java","python","C","CPP","ML","java"};

        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].equals(arr[j])){
                    System.out.println("Duplicate Element found : "+arr[i]);
                    flag = true;
                }
                
            }
        }
        if(flag==false){
            System.out.println("Duplicate Element NOT Found");
        }

    }
}
