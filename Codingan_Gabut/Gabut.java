package Codingan_Gabut;

import java.util.Scanner;

public class Gabut {

  /**
   * @param args
   */
  public static void main(String[] args) {

    String kalkulator;
    int nilai_1 = 0;
    int nilai_2 = 0;
    int hasil;

    try (Scanner input_hasil = new Scanner(System.in)) {
      System.out.println("Kalkulator Sederhana");
      System.out.println("1. Penjumlahan");
      System.out.println("2. Pengurangan");
      System.out.println("3. perkalian");
      System.out.println("4. Pembagian");
      System.out.println("5. Modulus");
      System.out.println("6.Gatau Operator Apaan ini anjer lah :v");
      System.out.print("Masukan Operatornya (1) (2) (3) (4) (5) (6) :");
      kalkulator = input_hasil.next();

      if (kalkulator.equals("1")) {
        System.out.println("Masukan Nilai A");
        nilai_1 = input_hasil.nextInt();
        System.out.println("Masukan Nilai B");
        nilai_2 = input_hasil.nextInt();

        hasil = nilai_1 + nilai_2;

        System.out.println("Masukan Nilai A adalah :" + nilai_1);
        System.out.println("Masukan Nilai B adalah :" + nilai_2);
        System.out.println("Hasil Penjumlahan Adalah :" + hasil);

      } else if (kalkulator.equals("2")) {
        System.out.println("Masukan Nilai A");
        nilai_1 = input_hasil.nextInt();
        System.out.println("Masukan Nilai B");
        nilai_2 = input_hasil.nextInt();

        hasil = nilai_1 - nilai_2;

        System.out.println("Masukan Nilai A adalah" + nilai_1);
        System.out.println("Masukan Nilai B adalah" + nilai_2);
        System.out.println("Hasil Pengurangan Adalah :" + hasil);

      } else if (kalkulator.equals("3")) {
        System.out.println("Masukan Nilai A");
        nilai_1 = input_hasil.nextInt();
        System.out.println("Masukan Nilai B");
        nilai_2 = input_hasil.nextInt();

        hasil = nilai_1 * nilai_2;

        System.out.println("Masukan Nilai A adalah" + nilai_1);
        System.out.println("Masukan Nilai B adalah" + nilai_2);
        System.out.println("Hasil Perkalian Adalah :" + hasil);

      } else if (kalkulator.equals("4")) {
        System.out.println("Masukan Nilai A");
        nilai_1 = input_hasil.nextInt();
        System.out.println("Masukan Nilai B");
        nilai_2 = input_hasil.nextInt();

        hasil = nilai_1 / nilai_2;

        System.out.println("Masukan Nilai A adalah" + nilai_1);
        System.out.println("Masukan Nilai B adalah" + nilai_2);
        System.out.println("Hasil Pembagian Adalah :" + hasil);

      } else if (kalkulator.equals("5")) {
        System.out.println("Masukan Nilai A");
        nilai_1 = input_hasil.nextInt();
        System.out.println("Masukan Nilai B");
        nilai_2 = input_hasil.nextInt();

        hasil = nilai_1 % nilai_2;

        System.out.println("Masukan Nilai a adalah :" + nilai_1);
        System.out.println("Masukan Nilai b adalah :" + nilai_2);
        System.out.println("Hasil Dari Modulus Adalah :" + hasil);

      } else if (kalkulator.equals("6")) {
        System.out.println("Masukan Nilai A");
        nilai_1 = input_hasil.nextInt();
        System.out.println("Masukan Nilai B");
        nilai_2 = input_hasil.nextInt();

        hasil = nilai_1 = +nilai_2;

        System.out.println("Masukan Nilai a adalah :" + nilai_1);
        System.out.println("Masukan Nilai b adalah :" + nilai_2);
        System.out.println("Hasil Dari Modulus Adalah :" + hasil);
      }
    }
  }
}
