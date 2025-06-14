import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter The Timer Count :");
        int response;
        response=scanner.nextInt();

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int count=response;


            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count<0){
                    System.out.println("Over");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task,0,3000);
        scanner.close();
    }
}
