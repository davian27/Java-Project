package RPL_SEM2_Project.Tugas_25_januari_2022;
import java.util.Scanner;
public class Tugas_4 {
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan jumlah Data : ");
    int jumlah = input.nextInt();

    int[] nilai = new int[jumlah];

    for (int i = 0; i < jumlah; i++) {
      System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + ": ");
      nilai[i] = input.nextInt();
    }

    double total = 0;
    for (int i = 0; i < jumlah; i++) {
      total += nilai[i];
    }

    double rataRata = total / jumlah;

    System.out.println("Rata-rata nilai: " + rataRata);
  }
}
  

   

       