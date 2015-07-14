package home01;

public class Task7 {
    int Summ(int t) {

        return (t%10)+(t/10);
    }
    public static void main(String[] args) {
        Task7 task7=new Task7();
        System.out.println(task7.Summ(19));
    }
}
