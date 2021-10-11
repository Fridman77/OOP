
package Lab2.Task1;

public class Calculations {

    public static int area(int width, int height , int Depth) {
        int areaCube= 2*(width*height+width*Depth+height*Depth);
        return areaCube ;
    }

    public static int volume(int width, int height ,int Depth) {
        int volumeCube= (width*height*Depth);
        return volumeCube ;
    }
}
