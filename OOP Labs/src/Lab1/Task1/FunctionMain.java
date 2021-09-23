package Lab1.Task2;
import java.util.Scanner;

public class FunctionMain {
    public static void main(String[] args) {

        //Adding new objects with the proprieties I added 2 Monitors as requested in Task 1 Subtask 1
        Monitor Monitor1 = new Monitor("Samsung C27F","Black" ,100, 1920 , 1080 ,75 , true);
        Monitor Monitor2 = new Monitor("LG U13D","White" ,100, 11280 , 7120 ,160 , false);

        //Now I print the first Monitor without sale
        System.out.println("-----------------------------------------");
        System.out.println("Monitor 1 without sale");
        Monitor1.info();
        System.out.println("-----------------------------------------");

        //Now I made a change in the proprieties as requested in Task1 Subtask2
        Monitor1.MonitorPrice = Monitor1.MonitorPrice-20;
        System.out.println("Monitor 1 with sale");
        Monitor1.info();
        System.out.println("-----------------------------------------");

        //Price of the monitor
        System.out.println("Monitor 2 price");
        Monitor2.info();
        System.out.println("-----------------------------------------");

        //Now we will compare the monitors with a set of programmed commands
        System.out.println("A short comparition between Monitors");
        MonitorCompare.comparePrice(Monitor1.MonitorPrice, Monitor2.MonitorPrice);
        MonitorCompare.compareRefreshRate(Monitor1.RefreshRate, Monitor2.RefreshRate);
        MonitorCompare.compareResolution(Monitor1.HorizontalPixels * Monitor1.VerticalPixels ,Monitor2.HorizontalPixels * Monitor2.VerticalPixels);
        System.out.println("-----------------------------------------");

        //Now we will make the conclusion
        MonitorCompare.comparePoints();
    }

}
