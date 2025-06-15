import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("HH:mm:ss");
        String filePath="/home/zypher/Godzilla/projects/AlarmClock/GTA Type Beat - Dyalla.wav";
        LocalTime alarmTime=null;

        while (alarmTime == null) { 
        try {
        System.out.println("Enter an alarm time (HH:mm:ss): ");
        String inputTime = scanner.nextLine();

        alarmTime=LocalTime.parse(inputTime, formatter);
        System.out.println("Alarm set for : " + inputTime);
        } 
        catch (DateTimeParseException e) {
            System.out.println("Wrong format plz use HH:mm:ss !!!");

        }
        }

        AlarmClock alaramClock = new AlarmClock(alarmTime,filePath,scanner);
        Thread alarmThread = new Thread(alaramClock);
        alarmThread.start();

        

 


       
    }
}
