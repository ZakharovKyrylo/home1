package org.sourceit.zakharov.home01;

import java.util.Scanner;

public class Task10 {

    float area(int a,int b){
      return a*b/2;
    }
    float perimeter(int a,int b){
        float  c =(float)Math.sqrt(a*a+b*b);
        return a+b+c;
    }

    public static void main(String[] args) {
        Task10 task10=new Task10();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter two number");
        Integer x=scanner.nextInt();
        Integer y=scanner.nextInt();
        System.out.println(task10.area(x, y));
        System.out.println(task10.perimeter(x,y));
    }
}
