package org.sourceit.zakharov.home01;

public class Task3 {

    boolean isHappy(int t) {
        int k1 = 0, k2 = 0;
        for (int j = 0; j < 6; j++) {
            if (j < 3) {
                k1 = k1 + (t % 10);
                t = t / 10;
            } else {
                k2 = k2 + (t % 10);
                t = t / 10;
            }
        }
        return k1 == k2 ? true : false;
    }
    public static void main(String[] args) {
        Task3 task3=new Task3();
        int happy=0;
    for(int i=1;i<1000000;i++){
        if(task3.isHappy(i)){
            happy++;
        }
    }
      System.out.println(happy);
    }
}

