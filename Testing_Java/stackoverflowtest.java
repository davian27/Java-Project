package Testing_Java;

public class stackoverflowtest {
    public static void main(String[]args){
      int  a = 4;
      int b;
      int c;

b = a++; // first b will be 4, and after this a will be 5

// now a value is 5
c = ++a; // first a will be 6, then 6 will be assigned to c
    }
    
}
