import java.util.*;

public class sorting {

public static void bubbleSort(int arr[]){
    for(int turn = 0; turn <= arr.length; turn++){
        int swap = 0;
        for(int j = 0; j < arr.length - 1 - turn; j++){
            if(arr[j] > arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swap++;

            }


        }

    }


}
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            
        }
        System.out.println();
    }


// Selection sort Time Complaxity for this algo is too O(n^2)

public static void selectionSort(int arr[]){
    //the outer loop will iterate the array 
    for(int i = 0; i < arr.length - 1; i++){
        int minPos = i;// current position is the minimum
        //the inner loop will show from where the unsorted array begins, and we find the min from there -- then next we swap it
        for(int j = i + 1; j < arr.length; j++){
            if(arr[minPos] > arr[j]){
                minPos = j;
            }
        }
        // now we program for the swap here 
        int temp = arr[minPos];// minpos put in temp
        arr[minPos] = arr[i];//existing value put in minPos
        arr[i] = temp;//i updated with new min value and swapped
    }

}

// Insertion Sort --- inspiration from cards ## pick an element from unsorted part and place it in the right position in the sorted part 
// this way we will get a sorted array
public static void insertionSort(int arr[]){
    // consider the outer loop and see how many elements are needed to be moved at the right positions(n-1) elements
    for(int i = 1; i < arr.length-1; i++){
        int curr = arr[i];// to store the current value 
        int prev = i-1;
        //finding out he correct position to insert 
        while(prev >= 0 && arr[prev] > curr){
            arr[prev + 1] = arr[prev];
            prev--;
        }
        arr[prev + 1] = curr;

    }
}

// Counting Sort -- the numbers to sort are not that big, i.e. the range is small -- and in some cases the TC can be highly efficient.

// we find out the frequency of occurance of every element and store that in a count array
// and then we traverse the count array and fill the resulting array in sorted manner

// outer loop 0-n -- for freq
// another loop -- 0-max num -- range -- 2 loops total .. for sorting .... TC O(n+range) -- in the cases where the range is very 
// small, this sort would be able to give linear time complexity




public static void countingSort(int arr[]){

    int largest = Integer.MIN_VALUE; // we have to make a count array and for that we have to find the range -- So, we find the 
                                    // largest value in the array
    for(int i = 0; i < arr.length; i++){     // traverse the array
        largest = Math.max(largest, arr[i]); // the largest will be found out as such
    }

    // for finding out the frequency -- we iterate over the original array

    int count[] = new int[largest+1];   // the size of the cont array -- largest + 1 -- we include zero -- as we regard 0 a +ve.
    for(int i = 0; i < arr.length; i++){ // now we again iterate the array 
        count[arr[i]]++;                 // we update count array -- i -- number is taken as index -- in count we go at that index 
                                         // and ++ that num
    }
    // sorting -- count sort array -- freq array is iterated

    int j = 0;                              // in the original array we started from 0
    for(int i = 0; i < count.length; i++){ // we iterate over count array
        while(count[i] > 0){               // update elements till the i is greater than 0
            arr[j] = i;                    // till then we will include that nuber in the array and 
            j++;                           // increase the index 
            count[i]--;                    // and reduce the count successively
        }
    }
}




    public static void main(String args[]){  
        int arr[] = {5, 4, 1, 3, 2, 1, 8, 4, 11};
        // insertionSort(arr);
        // printArr(arr);
        //Arrays.sort(arr);// This is the inbuilt java function for the sorting of the array and its complexity is -- O(n logn)
                         // There is another way of passing parameters to this function that is we can declare a starting index (si)
                         // and an ending index(ei)
        //Arrays.sort(arr, 0, 3);
        countingSort(arr);
        printArr(arr);

        // Collections.reverseOrder() -- by import java.util.collections;
        //there are two types of variables in java -- object, and primitive vatiables (they are basic), collections. reverseOrder 
        //doesnot work on the primitive type of the variables, and so we have to declare not int but Integer type for the Collections
        // function to work
        
        // Arrays.sort(arr, Collections.reverseOrder()); 


    }
    
}