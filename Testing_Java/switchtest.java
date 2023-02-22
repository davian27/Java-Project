package Testing_Java;
import java.util.Scanner;
public class switchtest {

    
    /**
     * @param args
     */
    public static void main(String[]args){
      

        Scanner input = new Scanner(System.in);
          int i =0;
          switch (i) {
            case 1:
            i = input.nextInt();
            if(i >= 90 && i <=100){
              System.out.println("A");
              break;
          }
          case 2:
            i = input.nextInt();
            if(i >= 80 && i <= 90){
              System.out.println("B");
              break;
          }
          case 3:
            i = input.nextInt();
            if(i >= 75 && i <=80){
              System.out.println("C");
              break;
            }
            case 4:
            i = input.nextInt();
            if(i < 75){
              System.out.println("D");
              break;
            }
          }
        }
      }
    

    

