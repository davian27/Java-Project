package RPL_SEM2_Project.Tugas_18_Januari_2023;
import java.util.Scanner;
public class Tugas_4 {
  /**
   * @param args
   */
  public static void main(String[]args){

    Scanner input = new Scanner(System.in);

    System.out.println("Masukan Jumlah Kata :");
    int n=input.nextInt();
    

    String kata[]=new String[n];

    for (int i=0; i<kata.length;i++)
    {
  
      System.out.println("kata ke"+(i+1)+":");
      kata[i]=input.next();

    }
    System.out.println("kata kata yang dimasukan");
    for(int i =0;i<kata.length;i++)
    {
      System.out.print(kata[i]);
    }

  }
  
}
