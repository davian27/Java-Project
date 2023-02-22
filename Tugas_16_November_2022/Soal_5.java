package Tugas_16_November_2022;

public class Soal_5 {
    /**
     * @param args
     */
    public static void main(String[]args){
         String [] peliharaan ={"fish","bear","dog","angola","buffalo"};

         for(String value : peliharaan){
            if(value.contains("a")){
                continue;
            }
            System.out.println(value);
         }

    }
    
}
