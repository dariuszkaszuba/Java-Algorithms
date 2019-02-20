import controller.RGBCOntroller;
import model.RGB;

public class RGBMain {
    public static void main(String[] args) {
        RGBCOntroller rgb = new RGBCOntroller();
        RGB red= new RGB(255,0,0);
        RGB blue= new RGB(0,255,255);
        RGB strange= new RGB(120,120,120);
        System.out.println(red);
        System.out.println(blue);
        System.out.println(strange);
        System.out.println(rgb.mixColor(red,blue));
        System.out.println(rgb.mixColor(strange,blue));
        System.out.println(rgb.clearColor(strange));
    }
}
