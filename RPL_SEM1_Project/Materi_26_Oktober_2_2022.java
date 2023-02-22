package RPL_SEM1_Project;
import java.io.*;
public class Materi_26_Oktober_2_2022 {
    /**
     * @param args
     */
    public static void main(String[]args) throws Exception{

        String wak,kul,jurusan;
        int biaya,total;
        BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukan Kode Kuliah[pg/sg/ma/xc]");
        kul = x.readLine();
        
        if(kul.equalsIgnoreCase("pg")){
            jurusan = "System Informasi";
            wak = "Pagi";
            biaya = 1200000;
        }
        else if(kul.equalsIgnoreCase("sg")){
            jurusan = "System Informasi";
            wak = "Siang";
            biaya =1300000;
        }
        else if(kul.equalsIgnoreCase("ma")){
            jurusan ="System Informasi";
            wak = "Malam";
            biaya =1500000;
        }
        else if(kul.equalsIgnoreCase("xc")){
            jurusan = "System Informasi";
            wak ="Eksekutif";
            biaya=2000000;
        }
        else{
            jurusan ="Data Tidak Ada";
            wak ="Data Tidak Ada";
            biaya=0;
        }
        total = biaya+50000;
        System.out.println("Nama Jurusan  :" + jurusan);
        System.out.println("Waktu Kuliah  :" + wak);
        System.out.println("Biaya Kuliah  :" + biaya);
        System.out.println("Total Bayar   :" + total);


    }
    
}
