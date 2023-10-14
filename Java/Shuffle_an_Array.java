import java.util.*;
class Shuffle_an_Array{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7};
        Random randam = new Random();
        for(int i=0;i<arr.length;i++){
            int j = randam.nextInt(i+1);
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}