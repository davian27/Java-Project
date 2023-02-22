package Codingan_Latihan;
import java.util.Scanner;

public class testing_2 {
  public static void main(String[]args){
    

    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of rows and columns: ");
    int rows = input.nextInt();
    int columns = input.nextInt();
    int[][] array = new int[rows][columns];
    
    System.out.println("Enter the array elements: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        array[i][j] = input.nextInt();
      }
    }
    
    System.out.println("The array is: ");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}


