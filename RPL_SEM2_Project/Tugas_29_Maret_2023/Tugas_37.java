package RPL_SEM2_Project.Tugas_29_Maret_2023;

public class Tugas_37 {
  public static int panjangstr(String str){
    if(str == null){
        return 0;
    }
    return str.length();
}
public static void main(String[] args){
    System.out.println(panjangstr(null));
}
}
