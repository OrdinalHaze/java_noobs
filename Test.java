import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in); 

        myRunnable myRunnable =new myRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);

        thread.start();

      System.out.println("YOU HAVE !) SECOND TO ENTER YOUR NAME!!!");

      System.out.print("Enter your name :");
      String name= scanner.nextLine();
      System.out.println("Hello "+ name);
      
      






      scanner.close();
    }
}
