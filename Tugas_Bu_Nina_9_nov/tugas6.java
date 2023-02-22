package Tugas_Bu_Nina_9_nov;

public class tugas6 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int angka;
        boolean apaPrima = true;
        angka = 77;

        System.out.println("Contoh Perulangan For");
        System.out.println("==========================");

        System.out.println(angka + " " + "adalah bilangan :");

        for (int i = 2; i <= angka / i; i++) {
            if ((angka % i) == 0) {
                apaPrima = false;
                break;
            }
        }
        if (apaPrima)
            System.out.println("Prima");
        else
            System.out.println("Bukan Prima");
    }

}
