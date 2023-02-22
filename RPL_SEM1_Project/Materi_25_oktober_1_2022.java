package RPL_SEM1_Project;

public class Materi_25_oktober_1_2022 {
    /**
     * @param args
     */
    public static void main(String[]args){
        boolean warungBuka = true;
        boolean adaUang = false;

        if(warungBuka == true && adaUang == true){
            System.out.println("Bisa Jajan :)");
        }
        else if(warungBuka == false && adaUang == true){
            System.out.println("jajan ditempat lain");
        }
        else if(warungBuka == true && adaUang == false){
            System.out.println("Minta Uang dulu");
        }
        else if(warungBuka == false && adaUang == false){
            System.out.println("Tidak Bisa Jajan");
        }

    }
    
}
