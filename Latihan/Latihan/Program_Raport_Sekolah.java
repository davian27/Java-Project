package Latihan;

import java.util.Scanner;

public class Program_Raport_Sekolah {
   /**
    * @param args
    */
   public static void main(String[] args) {

      int nilai [] []= {
         {50,51,52,53,54,55,56,57,58,59,60},
         {61,62,63,64,65,66,67,68,69,70},
         {71,72,73,74,75,76,77,78,79,80},
         {81,82,83,84,85,86,87,88,89,90,100}
      };
      try (Scanner inputan_user = new Scanner(System.in)) {
         int nilai_siswa;
         String kelulusan;
         int nilai_kelulusan;
         int sikap;

         System.out.print("Masukan Nilai Siswa \t :");
         nilai_siswa = inputan_user.nextInt();
         String result_1 = (nilai_siswa >= 90 && nilai_siswa <= 100) ? "A" : "";
         System.out.println(result_1);

         String result_2 = (nilai_siswa >= 80 && nilai_siswa <= 90) ? "B" : "";
         System.out.println(result_2);

         String result_3 = (nilai_siswa >= 75 && nilai_siswa <= 79) ? "C" : "";
         System.out.println(result_3);

         String result_4 = (nilai_siswa < 75) ? "D" : "";
         System.out.println(result_4);

         System.out.println("Program Kelulusan Siswa");
         System.out.println("Kriteria Lulus");
         System.out.println("1.Nilai Harus Di Atas KKM");
         System.out.println("Nilai Sikap Tidak Boleh Di Bawah Kurang Baik");

         System.out.print("Masukan Nama Siswa \t :");
         kelulusan = inputan_user.next();
         System.out.println(
               "Nilai Sikap Siswa\n 1 = Sangat Baik \n 2 = Baik \n 3 = Cukup Baik \n 4 = Kurang Baik \n 5 = Buruk \n 6 = Sangat Buruk");
         System.out.print("Masukan Input Sikap\n:");
         sikap = inputan_user.nextInt();
         System.out.println("Nilai Siswa \n 0 = A \n 1 = B \n 2 = C \n 3 = D");
         System.out.println("Masukan Angkanya Bukan Alphabet Nya Terimakasih :)");
         System.out.print("Masukan Input Nilai\t:");
         nilai_kelulusan = inputan_user.nextInt();

         if (nilai_kelulusan == 0 && nilai_siswa >= 90 && sikap == 1) {
            System.out.println("Nama Siswa\t\t:" + kelulusan);
            System.out.println("Nilai Sikap Siswa :Sangat Baik");
            System.out.println("Nilai Siswa\t\t:" + result_1);
            System.out.println("Siswa Ini Telah Memenuhi Syarat Kelulusan");
            System.out.println("Siswa Ini Lulus Dengan Nilai A");
            System.out.println("Run Test Completed Build 33090");
         }
         else if (nilai_kelulusan == 0 && nilai_siswa >= 80 sikap) 
         }
      }

   }


