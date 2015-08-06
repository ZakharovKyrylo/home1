package org.sourceit.zakharov.home01;

public class Task2 {


    public static void main(String[] args) {
    int[] fib;
        fib= new int[11];
        fib[0]=fib[1]=1;
        for(int i=2;i < fib.length;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        for(int y=0;y < fib.length;y++ ) {
            System.out.println(fib[y]);
        }
    }
}
