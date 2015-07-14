package home01;

import java.util.Random;
import java.util.Scanner;


public class Task8 {

      public static void main(String[] args) {
        Random r=new Random();
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        Integer rand=scanner.nextInt();

        System.out.println(r.nextInt(2*rand)-rand);


    }


}
