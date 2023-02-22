package Codingan_Gabut;
import java.util.Scanner;
public class quote {
    /**
     * @param args
     */
    public static void main(String[]args){
        try (Scanner input = new Scanner(System.in)) {
            String sukses = "tidak ada sukses yang di dapatkan secara instan";
            boolean gagal;


            System.out.print("Masukan Input Mu True/False\t:");
        
            gagal = input.nextBoolean();
            if(gagal == true){
                System.out.println("Nikmati proses nya");
                System.out.println("Tetap Semangat dan konsisten");

            }
            else{
                System.out.println(sukses);
                System.out.println("teruslah berusaha sampai kau dapatkan apa yang kau mau");
               
            }
        }

    }
    
}
