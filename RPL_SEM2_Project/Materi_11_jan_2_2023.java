package RPL_SEM2_Project;

public class Materi_11_jan_2_2023 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double n1 = 7.5, n2 = 9, n3 = 4.8;
        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + "is the largest number");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + "is the largest number");
        } else {
            System.out.println(n3 + "us the largest number");
        }
    }

}
