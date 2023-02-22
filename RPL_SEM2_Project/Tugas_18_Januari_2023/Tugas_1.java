package RPL_SEM2_Project.Tugas_18_Januari_2023;

public class Tugas_1 {
  public static void main(String[]args){
    final int jumlahMhs = 4;
    double [] ipk = new double [jumlahMhs];
    String [] nama = {"Andre","Bunga","Christine","Dedianto"};

    for (int i=0; i<jumlahMhs;i++)
    ipk[i] =4+((double)i/10);

    System.out.printf("%-10s %4s\n","Nama","IPK");
    for(int j=0; j<jumlahMhs;j++)
    System.out.printf("%-10s %1.2f\n",nama[j],ipk[j]);
  }
  
}
