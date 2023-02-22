package RPL_SEM1_Project;
import java.util.Scanner;
public class Tugas_10_Oktober {
    
    /**
     * @param args
     */
    public static void main (String[] args){

        System.out.println("Program Menghitung Luas Trapesium");
         double rusuk_1,rusuk_2,tinggi_trapesium;

         Scanner input_user = new Scanner(System.in);

         System.out.println("Masukan Panjang Rusuk 1");
         rusuk_1 = input_user.nextDouble();

         System.out.println("Masukan Panjang Rusuk 2");
         rusuk_2 = input_user.nextDouble();

         System.out.println("Masukan Tinggi");
         tinggi_trapesium = input_user.nextDouble();
         double luas = 0.5*(rusuk_1 + rusuk_2)*tinggi_trapesium;

         System.out.println("Luas Trapesium Adalah :" + luas);


    }
}
