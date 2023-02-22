package RPL_SEM2_Project.Tugas_18_Januari_2023;

public class Tugas_8 {
  public static void main(String[]args){
    int dataku[]={1,2,3,4,5,6,7,8,9,40}; 
    int terendah = dataku[0];
    int tertinggi = dataku[0];
    int i, indexMax =0, indexMin =0;

    for(i=0; i<dataku.length;i++){
      System.out.println("Index ke" + i+"="+dataku[i]);
    }
    for(i=0; i<dataku.length;i++){
      if(dataku[i] < terendah){
        terendah = dataku[i]; indexMin = i;
      }
      else if(dataku[i] > tertinggi){
        tertinggi = dataku[i]; indexMax=i;
      }
    }
    System.out.println();
    System.out.println("Nilai Tertinggi"+ tertinggi+"Pada Indek"+ indexMax);
    System.out.println("Nilai Terendah"+ tertinggi+"Pada Indek"+ indexMin);
  }
  
}
