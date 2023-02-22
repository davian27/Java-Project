package Testing_Java;

import java.util.Scanner;

public class Google1 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            double Nilai_Akhir;
            System.out.print("Masukkan NIM Anda : ");
            String NIM = sc.next();
            System.out.print("Masukkan Nama Anda :");
            String Nama = sc.next();
            System.out.print("Masukkan UTS : ");
            Integer UTS = sc.nextInt();
            System.out.print("Masukkan UAS : ");
            Integer UAS = sc.nextInt();
            Nilai_Akhir = 0.4 * UTS + 0.6 * UAS;
            System.out.println("");
            System.out.println("");
            System.out.println("NIM Anda : " + NIM);
            System.out.println("Nama Anda : " + Nama);
            System.out.println("UTS : " + UTS);
            System.out.println("UAS : " + UAS);
            System.out.println("Nilai Akhir : " + Nilai_Akhir);
        }
    }

}
