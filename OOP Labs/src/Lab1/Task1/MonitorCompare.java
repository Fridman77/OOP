package Lab1.Task1;

//Comparison block. In this block all the comparisons will take place.
public class MonitorCompare{

    //We will use a system of points to compare and to see which is the best monitor
    public static int Monitor1Points=0;
    public static int Monitor2Points=0;
    //here is the price comparison block
    public static void comparePrice(int monitorPrice1, int monitorPrice2) {
        if (monitorPrice1 < monitorPrice2) {
            System.out.println("Monitor 1 has a better price");
            Monitor1Points++;
        }
        else if(monitorPrice1 == monitorPrice2) {
            System.out.println("Monitors have the same Price");
        }
        else {
            System.out.println("Monitor 2 has a better price");
            Monitor2Points++;
        }
    }
    //here is the RefreshRate comparison block
    public static void compareRefreshRate(int monitorRefreshRate1, int monitorRefreshRate2){
        if (monitorRefreshRate1 > monitorRefreshRate2) {
            System.out.println("Monitor 1 has a better refresh rate");
            Monitor1Points++;
        }
        else if(monitorRefreshRate1 == monitorRefreshRate2){
            System.out.println("Monitors have the same refresh rate");
        }
        else {
            System.out.println("Monitor 2 has a better refresh rate");
            Monitor2Points++;
        }
    }
    //here is the Resolution comparison block
    public static void compareResolution(int monitorResolution1, int monitorResolution2){
        if (monitorResolution1 > monitorResolution2) {
            System.out.println("Monitor 1 has wider resolution");
            Monitor1Points++;
        }
        else if(monitorResolution1 == monitorResolution2){
            System.out.println("Monitors have the same resolution");
        }
        else {
            System.out.println("Monitor 2 has a wider resolution");
            Monitor2Points++;
        }
    }
    //here is the final points comparison block
    public static void comparePoints(){
        if (Monitor1Points > Monitor2Points) {
            System.out.println("Monitor 1 is better");
            Monitor1Points++;
        }
        else if(Monitor1Points == Monitor2Points){
            System.out.println("By system settings monitors are the same so you can choose the most beautiful one");
        }
        else {
            System.out.println("Monitor 2 is better");
            Monitor2Points++;
        }
    }

}