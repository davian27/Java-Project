package Codingan_Gabut;
import java.util.Scanner;
 
public class Kalkulator {
 
    /**
     * @param args
     */
    public static void main(String[] args) {

        

        String pilih_operasi;
        int nilai_a = 0;
        int nilai_b = 0;
        double hasil;

        try (Scanner input_pilihan = new Scanner(System.in)) {
            System.out.println("_______________________________");
            System.out.println("Project Gabut Kalkulator: ");
            System.out.println("===============================");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Pemangkatan");
            System.out.println("_______________________________");
            System.out.print("Masukkan pilihan [1/2/3/4/5]: ");
            pilih_operasi = input_pilihan.next();

            //Logika Kalkulator Mulai Dari Baris Ini
            if(pilih_operasi.equals("1")){
                System.out.println("Masukan Nilai A");
                nilai_a = input_pilihan.nextInt();
                System.out.println("Masukan Nilai B");
                nilai_b = input_pilihan.nextInt();

                hasil = nilai_a + nilai_b;
                  
                System.out.println("Masukan Nilai A adalah :" + nilai_a);
                System.out.println("Masukan Nilai B adalah :" + nilai_b);
                System.out.println("Hasil Penjumlahan Adalah :" + hasil);

            } else if (pilih_operasi.equals("2")){
                System.out.println("Masukan Nilai A");
                nilai_a = input_pilihan.nextInt();
                System.out.println("Masukan Nilai B");
                nilai_b = input_pilihan.nextInt();

                hasil = nilai_a - nilai_b;

                System.out.println("Masukan Nilai A adalah :" + nilai_a);
                System.out.println("Masukan Nilai B adalah :" + nilai_b);
                System.out.println("Hasil Pengurangan Adalah :" + hasil);

            } else if (pilih_operasi.equals("3")){
                System.out.println("Masukan Nilai A");
                nilai_a = input_pilihan.nextInt();
                System.out.println("Masukan Nilai B");
                nilai_b = input_pilihan.nextInt();

                hasil = nilai_a * nilai_b;

                System.out.println("Masukan Nilai A adalah :" + nilai_a);
                System.out.println("Masukan Nilai B adalah :" + nilai_b);
                System.out.println("Hasil Perkalian Adalah :" + hasil);

            } else if (pilih_operasi.equals("4")){
                System.out.println("Masukan Nilai A");
                nilai_a = input_pilihan.nextInt();
                System.out.println("Masukan Nilai B");
                nilai_b = input_pilihan.nextInt();

                hasil = nilai_a / nilai_b;

                System.out.println("Masukan Nilai A adalah :" + nilai_a);
                System.out.println("Masukan Nilai B adalah :" + nilai_b);
                System.out.println("Hasil Pembagian Adalah :" + hasil);

            } else if (pilih_operasi.equals("5")){
                System.out.println("Masukan Nilai A");
                nilai_a = input_pilihan.nextInt();
                System.out.println("Masukan Nilai B");
                nilai_b = input_pilihan.nextInt();

                hasil = Math.pow(nilai_a, nilai_b);

                System.out.println("Masukan Nilai A adalah :" + nilai_a);
                System.out.println("Masukan Nilai B adalah :" + nilai_b);
                System.out.println("Hasil Pemangkatan Adalah :" + hasil);
            } else {
                System.out.println("Pilihan tidak ada / Tidak Tersedia ");
                System.out.println("Silahkan Masukan Pilihan Yang sudah Tersedia di atas");
            }
        }
        }

        

            
        }


    

        



    

        