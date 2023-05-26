import java.util.*;
public class array {
    public static void update(int marks[]){
        for(int i = 0; i<marks.length; i++){// to traverse the length of array i -- index
            marks[i] = marks[i] + 1;

        }
    }

    public static int linearSearch(int numbers[], int key){
        for(int i = 0; i<numbers.length; i++){// go from indes to array length 
            if(numbers[i] == key){// and chek against each index if the key is these
                return i;
            }
        }
        return -1;

    }
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;// -infinity
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){// this will traverse the array
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }

        }
        System.out.println("smallest value is :" +smallest);
        return largest;

    }

    // binary search
    public static int binarySearch(int numbers[], int key){
        int start = 0, end = numbers.length-1; // -- first we define start and end in BS
        
        while(start <= end){
            int mid = (start + end) / 2;

            // comparisons
            if(numbers[mid] == key){
                return mid;
            }
            else if(numbers[mid] < key){
                start = mid + 1;
            }else{// left
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void reverse(int numbers[]){
        int first = 0, last = numbers.length-1;
        while(first < last){
            //swap
            int temp = numbers[last];
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first++;
            last--;
        }


    }

    public static void pair_in_ary(int numbers[]){
        int tp = 0;
        // we use nested loop for this 
        for(int i = 0; i < numbers.length; i++){
            int current = numbers[i];// 2,4,6,8,10 
            for(int j = i+1; j < numbers.length; j++){
                System.out.print("(" + current + "," +numbers[j] + ") ");
                tp++;
            }
            System.out.println();


        }
        System.out.println("total pairs = " +tp);// tp = n(n-1)/2 -- to find the number of pairs// complexity = n^2 
                                                 // n+(n-1)+(n-2)+ ___ 1 -- sum of ap - proprtional to O(n^2)

    }

    // print sub-arranys
    public static void print_sub_arr(int numbers[]){
        int ts = 0;
        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();

        }        
        System.out.println("total sub arrays = " +ts);

    }

    public static void sum_max_subary(int numbers[]){
        int curSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    // print sub-array sum
                    curSum += numbers[k];

                }
                System.out.println(curSum);
                if(maxSum < curSum){
                    maxSum = curSum;
                }
            }

            
        }
        System.out.println("max sum = " + maxSum);



    }


    // Prefix array -- prefix sum -- in this we store sum upto the ith element in this array -- an optimized solution -- [prefix[i-1]+arr[i]]
    public static void prefix_sum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0]; // i.e what is the sum uptill the 0th element -- and that is 0

        // to cal prefix array
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];
        }
        for(int i = 0; i < numbers.length; i++){
            int start = i;
            for(int j = i; j < numbers.length; j++){
                int end = j;                          // here there are only 2 loops running -- therefore the time complexity is going to be n^2 -- O(n^2)  

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; // if start is 0 then the index will be -1 -- that is not possible, 
                                                                                      // so we add a condiotion with a ternary operator
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);

    }

    // Kadane's algorithm -- insteadd of keeping the sum of negative numbers in the array -- mark them as zero -- only one loop works here -- nad the T.C - O(n)
    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        // if all are negative then the o/p = 0 -- that will be a special case
        for(int i = 0; i < numbers.length; i++){
            cs = cs + numbers[i];
            if(cs < 0){
                cs = 0;

            }
            ms = Math.max(cs, ms);
        }
        System.out.println("max sum = " + ms);

    }



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // new -- gives new array -- gives a location in mem of comp. for storing []-- has the size of the array-- here int will hold 10 ints -- has mem for 10 ints.
        // array size is static -- we can't change at runtime ... only during declaration we can change
        // int numbers[] = {23, 99,58,53};// size = 4 -- ints.

        // String names[] = {"hri", "sham", "baaz"};// type -- string -- size -- 3 -- 3 strings sroted  
        
        // int marks[] = new int[100];   

        // marks[0] = sc.nextInt();//phy
        // marks[1] = sc.nextInt();//chem
        // marks[2] = sc.nextInt();//math

        // System.out.println("phy :" + marks[0]);
        // System.out.println("chem :" + marks[1]);
        // System.out.println("math :" + marks[2]);

        // //marks[2] = 100;// we updated the value of marks at position 2 && we can also 
        // marks[2] = marks[2]+3;// another way of updating the data in an array
        // System.out.println("math :" + marks[2]);
        // int percentage = ((marks[0] + marks[1] + marks[2]) / 3);
        // System.out.println("percentage :" + percentage + "%");
        // System.out.println("length of array =" + marks.length);// with the dot operator and method .length for length of array -- in forn of an integer

        // passing array as arguement

        // -- pass by value don't reflect in the main -- calling function-- pass by refernce -- in the function the changes done will reflect in the calling function
        // -- call by reference is used in array -- changes to the function in the calling function will also reflect in the main function

        // int marks[] = {97, 98, 99};
        // update(marks);
        // // to print marks
        // for(int i = 0; i<marks.length; i++){
        //     System.out.println(marks[i]+" ");
        // }
        // System.out.println();
        int numbers[] = {-2, -3, 4,-1, -2, 1, 5, -3};
        //int key = 25;
        // int key = 10;// at which index is this key located

        // int index = linearSearch(numbers, key); // function call
        // if(index == -1){
        //     System.out.println("key not found");
        // }else{
        //     System.out.println("key found at index " + index);
        // }

        // System.out.println("Largest value is :" +getLargest(numbers));
        // System.out.println("index for key is : " +binarySearch(numbers, key));  

        // reverse(numbers);
        // for(int i = 0; i < numbers.length; i++){
        //     System.out.println(numbers[i]);
        // }

        //pair_in_ary(numbers);


        //print_sub_arr(numbers);

        //sum_max_subary(numbers);

        //prefix_sum(numbers);
        kadanes(numbers);




 



    }
    
}
