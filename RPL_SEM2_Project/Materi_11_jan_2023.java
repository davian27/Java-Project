package RPL_SEM2_Project;

public class Materi_11_jan_2023 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int bilangan = 1;
        for (int i = 1; i <= 5; i++) {
            String hasil = "";
            for (int j = 0; j < i; j++) {
                hasil = hasil + (bilangan) + ", ";
                bilangan++;
            }
            System.out.println(hasil.substring(0, hasil.length() - 2));
        }
    }

}
