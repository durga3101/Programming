/**
 * Created by nvankaya on 5/19/16.
 */
import java.util.Scanner;

public class DiamondDemo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Diamond diamond=new Diamond();
        diamond.drawIsoscelesTriangle(n);
        diamond.drawDiamond(n);
        diamond.drawDiamondWithName(n);
    }
}