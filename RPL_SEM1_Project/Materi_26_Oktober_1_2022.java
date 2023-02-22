package RPL_SEM1_Project;
import java.util.Scanner;
public class Materi_26_Oktober_1_2022 {
    /**
     * @param args
     */
    public static void main(String[]args){
int nilai;
Scanner input = new Scanner(System.in);
System.out.println("Masukan Nilai Ujian (0-100)");
nilai = input.nextInt();

if(nilai >= 90 && nilai <= 100){
    System.out.println("Nilai Ujian = A");
}
else if(nilai >= 80 && nilai <=89){
    System.out.println("Nilai Ujian = B");
}
else if(nilai >= 60 && nilai <=79){
    System.out.println("Nilai Ujian = C");
}
else if(nilai >= 50 && nilai <= 59){
    System.out.println("Nilai Ujian = D");
}
else{
    System.out.println("Nilai Ujian = 3");
}
    }
    
}
