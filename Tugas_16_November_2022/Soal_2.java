package Tugas_16_November_2022;

public class Soal_2 {
    /**
     * @param args
     */
    public static void main(String[]args){

        int i,j,a;
        int b = 0;

        for( i = 1; i <= 4; i++){
            for( j =1; j <= 4; j++){
                if(j == 2)
                break;
                a = i*j;
                b = b+a;
            }
        }
        System.out.println(b);
    }
    
}
