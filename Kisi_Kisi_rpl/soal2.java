package Kisi_Kisi_rpl;

public class soal2 {
    /**
     * @param args
     */
    public static void main(String[]args){

        int [] [] nilai = {{10,12},{11,14}};

        for (int i = 0; i < nilai.length; i++){
            for(int j = 0; j < nilai[i].length; j++){
                System.out.println(nilai[i][j] + "\t");
            }
            System.out.println();
        }

    }
    
}
