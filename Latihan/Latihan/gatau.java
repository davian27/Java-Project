package Latihan;
public class gatau {
  public static void main(String[]args){
   String Sekolah [][] = {
    {"Smk 1 Malang","Smk 2 Malang","Smk 3 Malang","Smk 4 Malang","Smk 5 Malang"},
    {"Smk 6 Malang","Smk 7 Malang","Smk 8 Malang","Smk 9 Malang","Smk 10 Malang"}
   };
   for ( int i = 0; i <Sekolah.length;i++){
    for(int j = 0; j<Sekolah.length;j++){
      System.out.print("Nama Sekolah "+Sekolah[j][i]+"\n");
    }
   }
}
  }

