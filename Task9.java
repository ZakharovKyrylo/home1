package org.sourceit.zakharov.home01;

import java.util.Random;

public class Task9 {

    public static void main(String[] args) {
        Random rand=new Random();
        int check = rand.nextInt(150) + 5;
        System.out.println(check);
        if((check>25)&&(check<100)){
            System.out.println("number included in the interval (25;100) ");
        }
        else{
            System.out.println("number is not included in the interval (25;100) ");
        }
    }
}
