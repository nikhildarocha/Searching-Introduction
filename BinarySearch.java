package Searching;

/**
 * Created by nikhil on 15-10-2017.
 */
public class BinarySearch {

    public static int search(int arr[], int ulimit, int llimit, int value){

        int mid = (ulimit + llimit)/2;

        if(value == arr[mid]){
            return mid;
        }
        if(value > arr[mid]){
            return search(arr,mid +1,ulimit,value);
        }
        else
            return search(arr,llimit,mid,value);
        
    }

    public static void main(String[] args) {
        int arr[] = {1,3,4,5,6};
        int uLimit=0;
        int lLimmit = arr.length;

        System.out.println(search(arr,lLimmit,uLimit,3));

    }


}
