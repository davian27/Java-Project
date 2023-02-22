package Codingan_Gabut;

import java.util.Scanner;

public class Praktek {

  /**
   * @param args
   */
  public static void main(String[] args) {
    String hitung;
    int angka = 0;
    int angka_1 = 0;
    double hasil;

    try (Scanner input_user = new Scanner(System.in)) {
      System.out.println("Selamat Datang Di Menu Kalkulator");
      System.out.println("Silahkan pilih menu kalkulator di bawah ini");
      System.out.println("1.Penjumlahan");
      System.out.println("2.Pengurangan");
      System.out.println("3.Perkalian");
      System.out.println("4.Pembagian");
      System.out.println("Masukan Menu Kalkulator :");
      hitung = input_user.next();

      if (hitung.equals("1")) {
        System.out.println("Masukan Nilai A");
        angka = input_user.nextInt();
        System.out.println("Masukan Nilai B");
        angka_1 = input_user.nextInt();

        hasil = angka + angka_1;

        System.out.println("Masukan Nilai A Adalah");
        System.out.println("Masukan Nilai B");
        System.out.println("Hasil Dari Penjumlahan Adalah");

      } else if (hitung.equals("2")) {
        System.out.println("Masukan Nilai A");
        angka = input_user.nextInt();
        System.out.println("Masukan Nilai B");
        angka_1 = input_user.nextInt();

        hasil = angka - angka_1;

        System.out.println("Masukan Nilai A adalah :" + angka);
        System.out.println("Masukan Nilai B adalah :" + angka_1);
        System.out.println("Hasil Pengurangan Adalah :" + hasil);

      } else if (hitung.equals("3")) {
        System.out.println("Masukan Nilai A");
        angka = input_user.nextInt();
        System.out.println("Masukan Nilai B");
        angka_1 = input_user.nextInt();

        hasil = angka * angka_1;

        System.out.println("Masukan Nilai A Adalah" + angka);
        System.out.println("Masukan Nilai B Adalah" + angka_1);
        System.out.println("Hasil Dari Pembagian Adalah" + hasil);

      } else if (hitung.equals("4"))
        ;
      System.out.println("Masukan Nilai A");
      angka = input_user.nextInt();
      System.out.println("Masukan Nilai B");
      angka_1 = input_user.nextInt();
    }
    hasil = angka / angka_1;

    System.out.println("Masukan Hasil A Adalah" + angka);
    System.out.println("Masukan Nilai B Adalah" + angka_1);
    System.out.println("Hasil Dari Pembagian Adalah" + hasil);

  }
}
