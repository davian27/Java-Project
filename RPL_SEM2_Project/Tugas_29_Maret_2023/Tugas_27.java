package RPL_SEM2_Project.Tugas_29_Maret_2023;

public class Tugas_27 {
  static int faktor(int bil){
    int hasil = 1;
    for(int i = 1;i<=bil;i++){
hasil *=i;
    }
    return hasil;
  }
  public static void main(String[]args){
System.out.println(faktor(5));
  }
  
}
