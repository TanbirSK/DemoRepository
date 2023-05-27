import java.util.*;

public class twoDimArrays {

    public static boolean search(int matrix[][], int key){
        for( int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell ("+i+","+j+")");
                    return true;
               }

            }
        }
        System.out.println("key not found");
        return false;
    }

    // public static void printSpiral(int matrix[][]){
    //     int startRow = 0;
    //     int startCol = 0;
    //     int endRow = matrix.length - 1;
    //     int endCol = matrix[0].length - 1;

    //     while(startRow <= endRow && startCol <= endCol){
    //         //top
    //         for(int j = startCol; j <= endCol ; j++){// top
                
    //             System.out.print(matrix[startRow][j] + " ");
    //         }
    //         //right

    //         for(int i = startRow+1; i <= endRow; i++){
    //             System.out.print(matrix[i][endCol] + " ");
    //         }
    //         //bottom
    //         for(int j = endCol-1; j>= startCol; j--){
    //             if(startRow == endRow){
    //                 break;
    //             }
    //             System.out.print(matrix[endRow][j] + " ");
    //         }
    //         //left
    //         for(int i = endRow-1; i>= startRow+1; i--){
    //             if(startCol == endCol){
    //                 break;
    //             }
    //             System.out.print(matrix[i][startCol] + " ");
    //         }
    //         startCol++;
    //         startRow++;
    //         endRow--;
    //         endCol--;


            
    //     }
    //     System.out.println();

    // }

    public static int diagonalSum(int matrix[][]){
        int sum = 0;
        // for(int i=0; i<matrix.length; i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i == j){
        //             sum += matrix[i][j];
        //         }
        //         else if(i+j == matrix.length-1){
        //             sum += matrix[i][j];
        //         }

        //     }
        // }

        for(int i = 0; i<matrix.length; i++){
            //pd
            sum += matrix[i][i]; 
            //sd
            if(i != matrix.length-i-1){
                sum += matrix[i][matrix.length-i-1];

            }
            
        }
        System.out.println("Sum is :" + sum);
        return sum;
    }

    public static boolean stairCaseSrh(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1;// row start at 0 , col -- forst

        while(row < matrix.length && col >= 0){// rows 0-matrix.length
            if(matrix[row][col] == key){// check the condition
                System.out.println("key found at (" + row + ","+ col +")");
                return true;// important to addd return in boolean funciton

            }
            else if(key < matrix[row][col]){// case 2, lesser val
                col--;// move left

            }
            else{
                row++;// move down the star i.e ++ row
            }
        }
        System.out.println("key not found");
        return false;

    }

    public static void occurance(int matrix[][]){
       
    }

    public static void main(String args[]) {


        // Scanner sc = new Scanner(System.in);
        // int matrix [][] = new int [3][3];
        // int n = matrix.length, m = matrix[0].length;
        //         //this is for rows      //this is for columns-- this gives the index of the first row and col
        // for(int i = 0; i < n; i++){//rows
        //     for(int j = 0; j<m; j++){//cols
        //         matrix[i][j] = sc.nextInt();


        //     }// the above code represents how to take input in the 2D array 


        // } //this will show the way to get the output
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j<m; j++){
        //         System.out.print(matrix[i][j] + " ");
        //     }
        //     System.out.println();// next line after printing each row

        // }
        // search(matrix, 5); 
        
        // int matrix[][] = {{10, 20, 30, 40}
        //                     ,{15, 25, 35, 45}
        //                     ,{27, 29, 37, 48}
        //                     ,{32, 33, 39, 50}};
        // int key = 3;
        // stairCaseSrh(matrix, key);

        // int array[][] = {{4, 7, 8}, {8, 8, 7}};

        // int count7 = 0;
        // for(int i = 0; i < array.length; i++){
        //     for(int j = 0; j < array[0].length; j++){
        //         if(array[i][j] == 7){
        //             count7++;
        //         }
        //     }
        // }
        // System.out.println("count of " + 7+ " is :" + count7);

        // int array [][] = {{1 ,4, 9}, {11, 4, 3}, {2, 2, 3}};
        // int sum = 0;

        // for(int j = 0; j < array[0].length; j++){ 
        //     sum += array[1][j];
        // }
        // System.out.println("sum is : " + sum);
        
        // to find the transpose of a matrix
        
        int row = 2, column = 3;

        int matrix[][] = {{2, 3, 7}, {5, 6, 7}};

        // Display original matrix

        printMatrix(matrix);

        // transpose of the matrix

        int transpose[][] = new int[column][row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                transpose[j][i] = matrix[i][j];// exchange rows with columns and columns with rows
                
            }
        }
        printMatrix(transpose);
    }
    public static void printMatrix(int matrix[][]){
        System.out.println("The matrix is: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    

}

