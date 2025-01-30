import java.util.Scanner;

public class Operation {

    public void addition(int [][]arr1 , int [][]arr2 , int row1 , int row2 , int col1 , int col2){

        if(row1!=row2 || col1!=col2){
            System.out.println("Addition is not possible : ");
            return;
        }
        int [][]ans = new int[row1][col1];

        for(int i =0 ; i<row1 ; i++){
            for (int j = 0 ; j<col1 ; j++){
                ans[i][j]=arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println("The addtion of two matrix is : ");
        for(int i =0 ; i<row1 ; i++){
            System.out.print("| ");
            for (int j = 0 ; j<col1 ; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void subtraction(int [][]arr1 , int [][]arr2 , int row1 , int row2 , int col1 , int col2){

        if(row1!=row2 || col1!=col2){
            System.out.println("Subtraction is not possible : ");
            return;
        }
        int [][]ans = new int[row1][col1];

        for(int i =0 ; i<row1 ; i++){
            for (int j = 0 ; j<col1 ; j++){
                ans[i][j]=arr1[i][j]-arr2[i][j];
            }
        }

        System.out.println("The subtraction of two matrix is : ");
        for(int i =0 ; i<row1 ; i++){
            System.out.print("| ");
            for (int j = 0 ; j<col1 ; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void multiplcation(int [][]arr1 , int [][]arr2 , int row1 , int row2 , int col1 , int col2){

        if(row2!=col1){
            System.out.println("Multiplication is not possible : ");
            return;
        }
        int [][]ans = new int[row1][col2];

        for(int i =0 ; i<row1 ; i++){
            for (int j = 0 ; j<col2 ; j++){
                ans[i][j] = 0; 
                for (int k = 0; k < col1; k++) {
                    ans[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        System.out.println("The Multiplication of two matrix is : ");
        for(int i =0 ; i<row1 ; i++){
            System.out.print("| ");
            for (int j = 0 ; j<col2 ; j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println("|");
        }
    }


    public static void main(String[] args) {

        Operation o = new Operation();
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter rows and columns for the first matrix:");
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.println("Enter rows and columns for the second matrix:");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        System.out.println("Enter elements of the first matrix:");
        int[][] arr1 = new int[row1][col1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of the second matrix:");
        int[][] arr2 = new int[row2][col2];
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        o.addition(arr1,arr2,row1,row2,col1,col2);
        o.subtraction(arr1,arr2,row1,row2,col1,col2);
        o.multiplcation(arr1,arr2,row1,row2,col1,col2);

    }
}
