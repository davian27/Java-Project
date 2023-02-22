package RPL_SEM2_Project.Tugas_18_Januari_2023;

import javax.swing.JOptionPane;

public class Tugas_9 {
  /**
   * @param args
   */
  public static void main(String[]args){

    int input = Integer.parseInt(JOptionPane.showInputDialog("Masukan Jumlah Elemen Array"));
    int dataku[] = new int[input];
    System.out.println("Jumlah Elemen Array :"+ input);
    int terendah =100;
    int tertinggi=0;
    int i,indexMax =0, indexMin =0;

    for(i=0; i<dataku.length;i++){
      int inputElemen = Integer.parseInt(JOptionPane.showInputDialog(null,"Masukan Nilai Index"+i));
      dataku[i] = inputElemen;
      System.out.println("Nilai Pada Index"+i+"="+dataku[i]);
    }
    for(i=0;i<dataku.length;i++){
if(dataku[i]< terendah){
  terendah = dataku[i];
  indexMin =i;
}
if(dataku[i] > tertinggi){
  tertinggi = dataku[i];
  indexMax =i;
}
    }
    System.out.println("");
    System.out.println("Nilai Tertinggi :"+ tertinggi+"Pada Indek"+indexMax);
    System.out.println("Nilai Terendah :"+ tertinggi+"Pada Indek"+indexMin);

  }
  
}
