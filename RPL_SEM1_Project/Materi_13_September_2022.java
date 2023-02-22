package RPL_SEM1_Project;
import java.util.Scanner;

public class Materi_13_September_2022 {

  /**
   * @param args
   */
  public static void main(String[] args){

    Scanner user_input = new Scanner (System.in);

    int  panjang,lebar,luas;
    



    System.out.println("Masukan Panjang =");
    panjang = user_input.nextInt();

    

    System.out.println("Masukan Lebar =");
    lebar = user_input.nextInt();

    luas = panjang * lebar;
    System.out.println("Luas Persegi adalah =" + luas);

    



  }
  
}
