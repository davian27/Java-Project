package Rumus_Matematika_Test;
import java.util.Scanner;
public class luas_kubus {

    /**
     * @param args
     */
    public static void main(String[]args){

        int sisi_1;
        int sisi_2;

        Scanner user_input = new Scanner(System.in);
        System.out.println("Program Untuk Menghitung Luas Kubus");

        //Kode Input User Dan Proses Hasil Luas
        System.out.println("Masukan Sisi 1 Dari Kubus :");
        sisi_1 = user_input.nextInt();

        System.out.println("Masukan Sisi 2 Dari Kubus :");
        sisi_2 = user_input.nextInt();

        int luas = sisi_1*sisi_2*6;

        //Output Program 
        System.out.println("Diketahui");
        System.out.println("Sisi 1 Kubus Adalah :" + sisi_1);
        System.out.println("Sisi 2 Kubus Adalah :" + sisi_2);
        System.out.println("Luas Kubus Adalah :" + luas);
    }
    
}
