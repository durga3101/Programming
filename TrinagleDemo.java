import java.util.Scanner;

/**
 * Created by nvankaya on 5/19/16.
 */
public class TrinagleDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Triangle triangle = new Triangle();
        triangle.drawSingle();
        triangle.drawHorizontalLine(n);
        triangle.drawVerticalLine(n);
        triangle.drawRightTriangle(n);
    }
}
