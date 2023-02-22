package Rumus_Matematika_Test;
import java.util.Scanner;
public class luas_segitiga {

    /**
     * @param args
     */
    public static void main(String[] args){
        double alas_1;
        double tinggi_segitiga;
        
        
        
        Scanner input_dari_user = new Scanner(System.in);
        
        System.out.println("Program Ini Akan Menghitung Luas Segitiga");

        //Program Inputan User
        System.out.println("Masukan Alas Segitiga");
        alas_1 = input_dari_user.nextDouble();

        System.out.println("Masukan Tinggi Dari Segitiga");
        tinggi_segitiga = input_dari_user.nextDouble();
        double luas = 0.5*(tinggi_segitiga*alas_1);

        System.out.println("Luas Segitiga Adalah :" + luas );



    }
    
}
