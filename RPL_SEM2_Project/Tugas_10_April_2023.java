package RPL_SEM2_Project;

public class Tugas_10_April_2023 {

  static int tambah(int []array){
int hasil = 0;
    for(int i = 0; i < array.length; i++){
      hasil = hasil + array[i];
    }
    return hasil;
  }
  public static void main(String[]args){
int array [] ={5,5};
int hasilseluruh = tambah(array);
System.out.println(hasilseluruh);

  }
  
}
