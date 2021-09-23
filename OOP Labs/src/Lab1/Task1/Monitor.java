package Lab1.Task2;

public class Monitor {
    private String ModelName;
    private String Color;
    public int MonitorPrice;
    public int HorizontalPixels;
    public int VerticalPixels;
    public int RefreshRate;
    private boolean IsCurbed;

    public Monitor(String ModelName ,String Color ,int MonitorPrice ,int HorizontalPixels ,int VerticalPixels ,int RefreshRate ,boolean IsCurbed ){
        this.ModelName = ModelName;
        this.Color = Color;
        this.MonitorPrice = MonitorPrice;
        this.HorizontalPixels = HorizontalPixels;
        this.VerticalPixels = VerticalPixels;
        this.RefreshRate = RefreshRate;
        this.IsCurbed = IsCurbed;
    }

    public void info() {
        System.out.println("Monitor Proprieties are :\n"+"Model:"+ModelName+"\n"+"Color:"+Color+"\n"+"Price(USD):"+MonitorPrice+
                "\n"+"Resolution:"+HorizontalPixels+"x"+VerticalPixels+"\n"+"RefreshRate:"+RefreshRate+"Hz"+"\n"+
                "Curbed:"+IsCurbed+"\n");
    }
};

