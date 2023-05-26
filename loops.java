
import java.util.*;
public class loops {
    /**
     * @param args
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // print hello world 100 times.

        //int counter = 0;

        // while (counter <= 100){
        //     System.out.println("Hello World");
        //     counter++;
        // }
        // System.out.println("Completed the loop");

        // while (counter <=100){
        //     System.out.print(counter+ " ");
        //     counter+=1;
        // }

        // print num from 1 to n 

        // int range = sc.nextInt();
        // int counter = 1;

        // while (counter <= range){
        //     System.out.print(counter + " ");
        //     counter++;
        // }
        // System.out.println();

        // print the sum of first n natural numbers

        // int n = sc.nextInt();
        // int sum = 0;
        // int i = 1;
        // while (i <= n){
        //     sum += i;
        //     i++;
        // }
        // System.out.println(sum);
        // int n = sc.nextInt();
        // int sum = 0;
        // int counter = 1;
        // while (counter <= n){
        //     sum += counter;
        //     counter ++;

        // }
        // System.out.println(sum);

        // print the sum of the squares of the first n natural numbers

        // int n = sc.nextInt();

     // for loops 

    //  for(int i = 1; i<=9; i++){
    //     System.out.println("Hello World ");
    //  }

    // to print a square pattern

    // int lines;
    // for(lines = 1; lines <=4; lines++){
    //     System .out.println("* * * *");
    // }

    // int line = 1;
    // while(line <=4){
    //     System.out.println("* * * *");
    //     line++;
    // }

    // to print reverse of a number

    // int number = sc.nextInt();
    // // we can use modulo % operator
    // // to get the last digit of a number
    // while(number > 0){
    //     int lastDig = number % 10;
    //     System.out.print(lastDig);
    //     number = number / 10;    
    // }
    
    // System.out.println();


    // Now reverse the number i.e. the original number

    // int n = 10899;
    // int rev = 0;
    // while(n>0){
    //     int lastDig = n % 10; // to fetch last digit out of the given nimber
    //     rev = (rev*10) + lastDig;
    //     n = n / 10;  // will give updated n for next iteration of the foor loop

    // }
    // System.out.println(rev);


    //  do while loop .... in this 

    // int count = 1; // initialize count with 1

    // do {
    //     System.out.println("Programming is fun");
    //     count++;
    // } while(count<=5);


    // Break Statement ... exit loop 

    // 

    // do {
    //     System.out.println("Enter a number");
    //     int i = sc.nextInt();
    //     if(i % 10 == 0){
    //         break;
    //     }
    //     System.out.println(i);

    // }while(true);


    //Continue Statement - to skip an iteration in a loop 

    // for(int i=0; i<=5; i++) {
    //     if(i == 3){
    //         continue;
    //     }
    //     System.out.println(i);

    //}

    // to display all numbers except the multiples of 10

    // do {
    //     System.out.println("Enter Numbrer");
    //     int i = sc.nextInt();
    //     if (i % 10 == 0) {
    //         continue;

    //     }
    //     System.out.println("your num was :" + i);

    // } while (true);
    
    // to check if the number is prime

        // System.out.println("Enter a number n");
        // int n = sc.nextInt();
        // if(n == 2){
        //     System.out.println("n is prime");
        // }else {

        //     boolean isPrime = true;
        // for(int i =2; i<=Math.sqrt(n); i++){
        //     if(n % i == 0){ // n is a multiple of i 
        //         isPrime = false;
        //     }
        // }

        // if(isPrime == true){
        //     System.out.println("n is Prime");
        // }else {
        //     System.out.println("n is not prime");
        //     }


        // }

        // for(int i = 0; i <5; i++){
        //     System.out.println("Hello World");
        //     i += 2;
        // }

        // to find the factorial of a number entered by the user

        // int number;
        // int choice;
        // int evenSum = 0;
        // int oddSum = 0;

        // do {
        //     System.out.println("Enter a number");
        //     number = sc.nextInt();
        //     if (number % 2 == 0) {
        //         evenSum += number;
        //     }else {
        //         oddSum += number;
        //     }
        //     System.out.println("Do you want to continue? (1y/0n)");
        //     choice = sc.nextInt();
        
        
        
        // } while(choice == 1);
        // System.out.println("The sum of even numbers is " + evenSum);
        // System.out.println("The sum of odd numbers is " + oddSum);


        //program to find factorial of a any guven number
        // System.out.println("Enter any number :");
        // int num = sc.nextInt();
        // int fact = 1; // this will hold factorial act as a counter
        // for (int i = 1; i <= num; i++) {// her i is less than equal number and for loop will coninue till i equals num and 
        //                                 //fact will be updated as a each iteration of for loop goes by being multiplied to i. 
        //     fact *= i;
        // }
        // System.out.println("The factorial of " + num + " is " + fact);


        // to write multiplication table of n.

        System.out.print("enter num :");
        int n = sc.nextInt();

        for(int i = 1; i<=20; i++){
            

            System.out.println(n + "*" + i + " = " + n*i);
        }


        //

        for(int i=0;i<=5;i++ ) {
            System.out.println("i = "+i); // i is limited between the braces so its scope is within these only

        }

        System.out.println("i after the loop = " + i);// outside the loop it will give error as it is out of scope for i


        



        

        

        

        








    }
}
