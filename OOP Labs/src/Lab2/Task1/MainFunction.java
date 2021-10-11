package Lab2.Task1;

public class MainFunction {
    public static void main(String[] args) {

        String measure="CM";
        Box Box1 = new Box(13, 65, 10);
        Box Box2 = new Box(11, 11, 12);
        Box Box3 = new Box(21, 12, 32);


        System.out.println("Area of the box is: "+Calculations.area(Box1.Width,Box1.Height,Box1.Depth)+measure);
        System.out.println("Volume of the box is: "+Calculations.volume(Box1.Width,Box1.Height,Box1.Depth)+measure);
    }
}
