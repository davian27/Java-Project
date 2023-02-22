package Codingan_Gabut;

import java.util.Scanner;

public class Contoh_kalkulator {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner input_user = new Scanner(System.in)) {

            String pilih_operasi_kalkulator;
            int nilai_a;
            int nilai_b;
            double hasil;

            System.out.println("Masukan input");
            System.out.println("1.Penjumlahan");
            System.out.println("2.Pengurangan");
            System.out.println("3.Perkalian");
            System.out.println("4.Pembagian");
            System.out.println("Masukan Pilihan : 1/2/3/4");
            pilih_operasi_kalkulator = input_user.next();

            if (pilih_operasi_kalkulator.equals("1")) {
                System.out.print("Masukan Nilai A :");
                nilai_a = input_user.nextInt();
                System.out.println("Masukan Nilai B");
                nilai_b = input_user.nextInt();

                hasil = nilai_a + nilai_b;

                System.out.println("Masukan Nilai A adalah :" + nilai_a);
                System.out.println("Masukan Nilai B adalah :" + nilai_b);
                System.out.println("Hasil Dari Penjumlahan Adalah :" + hasil);
            }

            else if (pilih_operasi_kalkulator.equals("2")) {
                System.out.print("Masukan Nilai A :");
                nilai_a = input_user.nextInt();
                System.out.println("Masukan Nilai B");
                nilai_b = input_user.nextInt();

                hasil = nilai_a - nilai_b;

                System.out.println("Masukan Nilai A adalah :" + nilai_a);
                System.out.println("Masukan Nilai B adalah :" + nilai_b);
                System.out.println("Hasil Dari Pengurangan Adalah :" + hasil);

            } else if (pilih_operasi_kalkulator.equals("3")) {
                System.out.print("Masukan Nilai A :");
                nilai_a = input_user.nextInt();
                System.out.println("Masukan Nilai B");
                nilai_b = input_user.nextInt();

                hasil = nilai_a * nilai_b;

                System.out.println("Masukan Nilai A adalah :" + nilai_a);
                System.out.println("Masukan Nilai B adalah :" + nilai_b);
                System.out.println("Hasil Dari Perkalian Adalah :" + hasil);

            } else if (pilih_operasi_kalkulator.equals("4")) {
                System.out.print("Masukan Nilai A :");
                nilai_a = input_user.nextInt();
                System.out.println("Masukan Nilai B");
                nilai_b = input_user.nextInt();

                hasil = nilai_a / nilai_b;

                System.out.println("Masukan Nilai A adalah :" + nilai_a);
                System.out.println("Masukan Nilai B adalah :" + nilai_b);
                System.out.println("Hasil Dari Pembagian Adalah :" + hasil);

            }

        }
    }
}
