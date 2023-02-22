package RPL_SEM1_Project;
import java.util.Scanner;
public class Materi_17_Oktober {

    /**
     * @param args
     */
    public static void main(String[]args){

        /*
         * Anggota Kelompok
         * Davian Naufal F. (Kerja)
         * Alip Ivan Nur H.(Kelompok)
         * Aurel Dhechika(kelompok)
         * Anggraeni P.(Kelompok)
         */

      Scanner user_input = new Scanner(System.in);

      String tanaman;
      int hasil;
      int ciri;
      

      System.out.println("Masukan Nama Tanaman");
      tanaman = user_input.nextLine();
      System.out.println("Apakah Tanaman Tersebut Berkecambah ? \n 1(Tidak) \n 2(Ya)");
      System.out.print("Masukan Input mu :");
      hasil = user_input.nextInt();
      System.out.println("Berakar apa Tanaman Tersebut \n 1.Serabut \n 2.Tunggal");
      System.out.print("Masukan Input mu :");
      ciri = user_input.nextInt();
      
      if(hasil == 2){
        System.out.println("Jenis Tanaman Yang Kamu Masukan Adalah \t:" +tanaman);
        System.out.println("Deskipsi Tanaman Yang Kamu Masukan");
        System.out.println("_________________________________________________________");
          
    }
    else if(hasil == 1){
        System.out.println("Jenis Tanaman Yang Kamu Masukan \t:" +tanaman);
        System.out.println("Deskripsi Tanaman Yang Kamu Masukan");
        System.out.println("_________________________________________________________");
    }
    if(ciri == 1 && hasil == 1){
      System.out.println("1.Tanaman Ini Tidak Berkecambah");
      System.out.println("2.Tanaman Ini Termasuk Dalam Kategori Monokotil");
      System.out.println("3.Tanaman Ini Berakar Serabut");
      System.out.println("4.Jumlah Kelopak Bunga kelipatan 3");
      System.out.println("5.Daun nya Halus Dan Bertulang Sejajar");
      System.out.println("6.Batang Sejajar Dan Tidak Beruas Ruas");
    }
    else if(ciri == 2 && hasil == 2){
      System.out.println("1.Tanaman Ini Berkecambah");
      System.out.println("2.Tanaman Ini Termasuk Dalam Kategori Dikotil");
      System.out.println("3.Tanaman Ini Berakar Tunggal"); 
      System.out.println("4.Memiliki Daun Menjari Atau Menyirip");
      System.out.println("5.Memiliki Akar Dan Batang Yang Besar/Berkambium");

    }
    if(hasil == 2 && ciri == 1){
      System.out.println("1.Tanaman ini Berkecambah");
      System.out.println("2.Tanaman Ini Termasuk Dalam Kategori Monokotil");
      System.out.println("3.Tanaman Ini Berakar Serabut");
      System.out.println("4.Jumlah Kelopak Bunga kelipatan 3");
      System.out.println("5.Daun nya Halus Dan Bertulang Sejajar");
      System.out.println("6.Batang Sejajar Dan Tidak Beruas Ruas");

    }
   if(hasil == 1 && ciri == 2){
      System.out.println("1.Tanaman Ini Tidak Berkecambah");
      System.out.println("2.Tanaman Ini Termasuk Dalam Kategori Dikotil");
      System.out.println("3.Tanaman Ini Berakar Tunggal");
      System.out.println("4.Memiliki Daun Menjari atau Menyirip");
      System.out.println("5.Memiliki Akar Dan Batang Yang Besar/Berkambium");
    }
  }
}

        






    

