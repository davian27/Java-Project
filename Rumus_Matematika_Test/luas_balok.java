package Rumus_Matematika_Test;
import java.util.Scanner;
public class luas_balok {

    /**
     * @param args
     */
    public static void main(String[]args){

        int panjang;
        int lebar;
        int tinggi;

        System.out.println("Program Menghitung Luas Balok");
        Scanner input_manusia = new Scanner(System.in);

        System.out.println("Masukan Panjang Balok =");
        panjang = input_manusia.nextInt();

        System.out.println("Masukan Lebar Balok =");
        lebar = input_manusia.nextInt();

        System.out.println("Masukan Tinggi Balok =");
        tinggi = input_manusia.nextInt();

        int hasil = panjang*lebar*tinggi;

        System.out.println("Hasil Nya Adalah");
        System.out.println("Panjang :"  + panjang);
        System.out.println("Lebar :" + lebar);
        System.out.println("Tinggi :" + tinggi);
        System.out.println("Luas Balok Adalah :" + hasil);


    }
    
}
