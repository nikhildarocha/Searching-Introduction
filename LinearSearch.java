package Searching;

/**
 * Created by nikhil on 15-10-2017.
 */
public class LinearSearch {

    public int search(int arr[], int value){
        int i=0;
        for( i=0; i<arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;


    }

    public static void main(String[] args) {
        int arr [] = { 1,2,5,2,5,7,9,8};
        LinearSearch s = new LinearSearch();
        System.out.println(s.search(arr,5));


    }
}
