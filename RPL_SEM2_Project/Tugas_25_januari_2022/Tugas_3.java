package RPL_SEM2_Project.Tugas_25_januari_2022;
import java.util.Scanner;
public class Tugas_3 {
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] uas = new int[6];
    for (int i = 0; i < uas.length; i++) {
        System.out.print("Masukan nilai UAS MHS ke-" + i + ": ");
        uas[i] = scan.nextInt();
    }
    for(int i =0; i< uas.length;i++) {
        if(uas[i] > 70){
            System.out.println("Mahasiswa ke-"+i+" lulus ! ");
        }
        else{
          System.out.println("Mahasiswa ke- "+i+" tidak lulus !");
        }
    }
}
}
