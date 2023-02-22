package RPL_SEM2_Project.Tugas_18_Januari_2023;

import javax.swing.JOptionPane;

public class Tugas_10 {
  /**
   * @param args
   */
  public static void main(String[]args){
int dataku[] ={1,2,3,4,5,6,7,8,9,400};
int i, input=0;

for(i=0; i<dataku.length;i++){
  System.out.println("Index ke"+ i+"="+dataku[i]);
}
int cari = Integer.parseInt(JOptionPane.showInputDialog("Cari Nilai Array"));
System.out.println(" ");
for(i=0;i<dataku.length;i++){
  if(dataku[i] == cari){
    System.out.println(cari+"Ketemu Pada Index"+i);

  }
}
input = Integer.parseInt(JOptionPane.showInputDialog("Ganti Nilai"+cari+"Dengan?"));
System.out.println(" ");
for(i=0;i<dataku.length;i++){
  if(dataku[i] == cari){
    dataku[i] = input;
  }
  System.out.println("Index Ke"+i+"="+ dataku[i]);
}
  }
  
}
