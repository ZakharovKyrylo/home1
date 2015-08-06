package org.sourceit.zakharov.home01;

public class Task6 {

    boolean task6(int t){
        return t % 2 == 0 ? true : false ;
    }
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        System.out.println(task6.task6(8));
    }
}
