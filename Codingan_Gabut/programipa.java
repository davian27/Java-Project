package Codingan_Gabut;
import java.util.Scanner;
public class programipa {

    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner user_input = new Scanner(System.in);

        String tanaman;
        int ciri;
        double hasil;
        double hasil_1;

       

        System.out.println("Masukan Nama Tumbuhan");
        tanaman = user_input.nextLine();
        System.out.println("Apakah Tanaman Ini Berkecambah Atau Tidak \n 1.Ya \n 2.Tidak");
        System.out.println("Masukan Input\t:");
        hasil = user_input.nextInt();

        if(hasil == 1){
            System.out.println("Tanaman Ini Berkecambah");
        }
        else if(hasil == 2){
            System.out.println("Tanaman Ini Tidak Berkecambah");
        }
        System.out.println("Tanaman Ini Memiliki Akar Yang Seperti Apa ? \n 1.Serabut \n 2.Tunggal");
        System.out.println("Masukan Input\t:");
        ciri = user_input.nextInt();
        if(ciri == 1){
            System.out.println("Tanaman Ini Memiliki Akar Serabut");
        }
        else if(ciri == 2){
            System.out.println("Tanaman Ini Memiliki Akar Tunggal");
        }
        System.out.println("Hasil Dari Penelitian Tersebut Mengklasifikasi Kan Tumbuhan Ini Sebagai");
        System.out.println("Nama Tumbuhan : "+ tanaman );
        System.out.println("Ciri Ciri Tumbuhan mu :");
        System.out.println("Tanaman Ini Memiliki Akar" + hasil);
        System.out.println("Tanaman Ini" + hasil);
        

        }
    
       
    
    





    }
    

