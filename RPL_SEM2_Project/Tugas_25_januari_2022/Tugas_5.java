package RPL_SEM2_Project.Tugas_25_januari_2022;

public class Tugas_5 {
  public static void main(String[]args){
    int[][] angka = {{12, 14, 34}, {30, 21, 67}};
    for (int[] number : angka) {
        for (int i : number) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
}