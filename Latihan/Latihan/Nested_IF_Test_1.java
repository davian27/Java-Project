package Latihan;

import java.util.*;

public class Nested_IF_Test_1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int turu;

        System.out.println("Masukan Input Anda");
        turu = input.nextInt();

        if (turu == 1) {
            System.out.println("Segera Turu");
            if (turu == 2) {
                System.out.println("Turu Atau Tidak ?");
            } else if (turu == 3) {
                System.out.println("Turu");
            }

        } else {
            System.out.println("Tidak Perlu Turu");
        }

    }

}
