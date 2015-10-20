import java.util.Scanner;
public class P{
    public static void main (String[] args){
    
    int i=0;
    long val=3;
    for (i=0; i<5;i++){
        val = A(val);
        System.out.println(val);
    }
    System.out.println("val: "+ val);
    int p = (int) val;
    System.out.println(p);
    }
    
    public static long A(long a){
        return a*a;
    }
}

