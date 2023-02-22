package Codingan_Gabut;

import java.util.Scanner;

public class Kasir {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String nama_barang;
            int jumlah_barang, harga, totalharga;
            double diskon = 0.075;
            double totalbayar;
            System.out.println("Program Kasir Sederhana");
            System.out.println("_____________________________");
            System.out.println("Masukan Data berikut :");
            System.out.print("Nama Barang =");
            nama_barang = input.nextLine();

            System.out.print("Jumlah Barang = ");
            jumlah_barang = input.nextInt();
            if (jumlah_barang <= 0) {

                System.out.println("Mohon masukan jumlah yang benar dan ulangi program");
                System.exit(0);
            }
            System.out.print("Harga Barang = Rp");
            harga = input.nextInt();
            if (harga < 100) {
                System.out.println("Mohon masukan harga yang valid dan ulangi");
                System.exit(0);
            }
            System.out.println("Anda Mendapatkan diskon 7,5%");
            totalharga = jumlah_barang * harga;
            System.out.println("Total harga = Rp " + totalharga);
            diskon = totalharga * diskon;
            totalbayar = totalharga - diskon;
            System.out.println("Total Bayar = Rp" + totalbayar);
            System.out.println("_____________________________");
            System.out.println("Nota Belanja :");
            System.out.println("Nama Barang =" + nama_barang);
            System.out.println("Jumlah Barang =" + jumlah_barang);
            System.out.println("Harga Barang = Rp" + harga);
            System.out.println("Total Harga = Rp" + totalharga);
            System.out.println("Total Bayar =Rp" + totalbayar);
        }
        System.out.println("_____________________________");

    }

}