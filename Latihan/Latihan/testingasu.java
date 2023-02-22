package Latihan;

public class testingasu {
  public static void main(String[]args){
    int[][] rata = {{1,9,8},{7,8,3},{7,7,5},{6,10,2}};
    double hasil = 0;
    int kolom_index = 1; 
    for (int i = 0; i < rata.length; i++) {
      hasil += rata[i][kolom_index];
    }
    hasil /= rata.length;
    System.out.println("Rata-rata dari kolom ke-" + (kolom_index + 1) + ": " + hasil);
  }
}
  
 
       
    
