package RPL_SEM1_Project;

import java.util.Scanner;

import javax.swing.text.html.MinimalHTMLWriter;

public class Materi_1_November_2022 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String makanan, jenisMakanan, minuman, Jenisminuman;

        System.out.println("Apakah anda mau Makan(y/n)");
        makanan = in.nextLine();

        if (makanan.equalsIgnoreCase("y")) {
            System.out.println("Plilih Makanan");
            System.out.println("Bakmi");
            System.out.println("Bakso");
            System.out.println("Nasgor");
            jenisMakanan = in.nextLine();

            if (jenisMakanan.equalsIgnoreCase("Bakmi")) {
                System.out.println("Harga" + jenisMakanan + "Rp.12.000");
            } else if (jenisMakanan.equalsIgnoreCase("Bakso")) {
                System.out.println("Harga " + jenisMakanan + " Rp. 10.000");
            } else if (jenisMakanan.equalsIgnoreCase("Nasgor")) {
                System.out.println("Harga " + jenisMakanan + " Rp. 11.000");
            } else {
                System.out.println("Anda Tidak Memilih Apa apa ");
            }
        }

        else if (makanan.equalsIgnoreCase("n")) {
            System.out.println("Apakah Anda Mau minum");
            minuman = in.nextLine();

            if (minuman.equalsIgnoreCase("y")) {
                System.out.println("Pilih Minuman");
                System.out.println("Teh");
                System.out.println("Kopi");
                System.out.println("Susu");
                Jenisminuman = in.nextLine();

                if (Jenisminuman.equalsIgnoreCase("Teh")) {
                    System.out.println("harga " + Jenisminuman + " 4.000");
                } else if (Jenisminuman.equalsIgnoreCase("Kopi")) {
                    System.out.println("Harga " + Jenisminuman + " 4.000");
                } else if (Jenisminuman.equalsIgnoreCase("Susu")) {
                    System.out.println("Harga " + Jenisminuman + " 5.000");
                }
            } else if (minuman.equalsIgnoreCase("n")) {
                System.out.println("Terimakasih Semoga Harimu Menenangkan");
            } else {
                System.out.println("Anda Tidak Memilih Apa Apa");
            }
        } else {
            System.out.println("Pilihan Salah");
        }
    }
}
