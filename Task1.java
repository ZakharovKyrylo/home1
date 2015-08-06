package org.sourceit.zakharov.home01;
import java.util.Scanner;

/**
 * Created by Кирилл on 13.06.2015.
 */
public class Task1 {

    int namber(int t){
        int num=0;
       for(int i=1;;i++){
            num=num+t%10;
            t=t/10;
            if(t==0){
                return num;
            }
        }
    }

    public static void main(String[] args) {
        Task1 task1=new Task1();
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter number");
        Integer r=scanner.nextInt();
        System.out.println(task1.namber(r));
    }
}

