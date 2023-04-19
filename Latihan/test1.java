public class test1 {
  public static int hitungTotalArray(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
        total += arr[i];
    }
    return total;
}
public static void main(String[] args){
int[] arr = {1, 2, 3, 4, 5};
int total = hitungTotalArray(arr);
System.out.println(total); // Output: 15

  
}
}
