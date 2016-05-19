/**
 * Created by nvankaya on 5/17/16.
 */
public class Triangle {
    public void drawSingle(){
        System.out.println("-----Single-----");
        System.out.println("*");
    }
    public void drawHorizontalLine(int n){
        System.out.println("-----Horizontal Line-----");
        for(int i=1;i<=n;i++)
        System.out.print("*");
        System.out.println();
    }
    public void drawVerticalLine(int n){
        System.out.println("-----Vertical Line-----");
        for(int i=1;i<=n;i++) {
            System.out.print("*");
            System.out.println();
        }
    }
    public void drawRightTriangle(int n){
        System.out.println("-----Right Triangle-----");
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=i;j++) System.out.print("*");
            System.out.println();
        }
    }
}