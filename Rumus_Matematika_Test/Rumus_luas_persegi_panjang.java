package Rumus_Matematika_Test;
import java.util.Scanner;
public class Rumus_luas_persegi_panjang {

    /**
     * @param args
     */
    public static void main(String[]args){
        int panjang;
        int lebar;

        Scanner input_user = new Scanner(System.in);

        System.out.println("Program Untuk Menghitung Luas Persegi Panjang");

        //Input Dari User
        System.out.println("Masukan Panjang Persegi");
        panjang = input_user.nextInt();

        System.out.println("Masukan Lebar Persegi");
        lebar = input_user.nextInt();

        int luas = panjang*lebar;

        System.out.println("Luas Persegi Panjang Adalah :" + luas);


    }
    
}
