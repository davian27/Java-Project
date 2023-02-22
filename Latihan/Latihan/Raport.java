package Latihan;

import java.util.*;

public class Raport {
  /**
   * @param args
   */
  public static void main(String[] args) {
    try (Scanner input_user = new Scanner(System.in)) {
      int nilai_siswa;

      String pilih_program;

      System.out.println("Masukan Angka Program Yang Ingin Anda Pakai");
      System.out.println("1.Program Pengelompokan Nilai");
      System.out.println("2.Program Kelulusan");
      System.out.print("Masukan Input\t:");
      pilih_program = input_user.next();

      if (pilih_program.equals("1")) {
        System.out.print("Masukan Nilai Siswa \t :");
        nilai_siswa = input_user.nextInt();
        String result_1 = (nilai_siswa >= 90 && nilai_siswa <= 100) ? "A" : "";
        System.out.println("Nilai Siswa Adalah\t:" + result_1);

        String result_2 = (nilai_siswa >= 80 && nilai_siswa <= 90) ? "B" : "";
        System.out.println("Nilai Siswa Adalah\t:" + result_2);

        String result_3 = (nilai_siswa >= 75 && nilai_siswa <= 79) ? "C" : "";
        System.out.println("Nilai Siswa Adalah\t:" + result_3);

        String result_4 = (nilai_siswa < 75) ? "D" : "";
        System.out.println("Nilai Siswa Adalah\t:" + result_4);

      }

      int nilai_kelulusan;
      int sikap;
      /*
       * Logika If Statement
       * Logika Nested If
       * Logika Program Raport
       */
      if (pilih_program.equals("2")) {

        String kelulusan;

        System.out.println("Program Kenaikan Kelas");
        System.out.println("Ketentuan Kenaikan Kelas");
        System.out.println("===================================================");

        System.out.println("1.Nilai Harus Di atas KKM");
        System.out.println("2.Nilai Sikap Tidak Boleh Di Bawah Kurang baik");
        System.out.println("___________________________________________________");
        System.out.print("Masukan Nama Siswa\t:");
        kelulusan = input_user.next();

        System.out.println(
            "Nilai Sikap Siswa\n 1 = Sangat Baik \n 2 = Baik \n 3 = Cukup Baik \n 4 = Kurang Baik \n 5 = Buruk \n 6 = Sangat Buruk");
        System.out.print("Masukan Input Sikap\n:");
        sikap = input_user.nextInt();
        System.out.println("Nilai Siswa \n 0 = A \n 1 = B \n 2 = C \n 3 = D");
        System.out.println("Masukan Angkanya Bukan Alphabet Nya Terimakasih :)");
        System.out.print("Masukan Input Nilai\t:");
        nilai_kelulusan = input_user.nextInt();
      }

    }

  }
}
