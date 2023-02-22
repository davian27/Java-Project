package RPL_SEM2_Project.Tugas_18_Januari_2023;
import java.util.ArrayList;
public class Tugas_6 {
  /**
   * @param args
   */
  public static void main(String[]args){

    ArrayList kantongajaib = new ArrayList();
    kantongajaib.add("Senter Pembesar");
    kantongajaib.add(532);
    kantongajaib.add("Tikus");
    kantongajaib.add(1231234.132);
    kantongajaib.add(true);

    kantongajaib.remove("tikus");

    System.out.println(kantongajaib);

    System.out.println("Kantong Ajaib berisi"+kantongajaib.size()+ " item");

  }
  
}
