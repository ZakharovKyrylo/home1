package home01;

import java.util.Scanner;

public class Task11 {


    void Function(int a,int b,int c){
         if((b*b-4*a*c)<0){
             System.out.println("no rootsi");
         }
        else {
             System.out.println((-b+ Math.sqrt(b * b - 4 * a * c))/2);
             System.out.println((-b-Math.sqrt(b * b - 4 * a * c))/2);
         }
    }

    public static void main(String[] args) {
        Task11 task11=new Task11();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter three number");
        Integer x=scanner.nextInt();
        Integer y=scanner.nextInt();
        Integer z=scanner.nextInt();
        task11.Function(x,y,z);
    }
}
