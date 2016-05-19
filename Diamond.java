/**
 * Created by nvankaya on 5/17/16.
 */
public class Diamond {
    public void drawIsoscelesTriangle(int n){
        System.out.println("-----Isosceles Triangle-----");
        for(int i=0;i<n;i++) {
            for (int k = ((n/2)+ 1);k>=i; k--) System.out.print(" ");
            for (int j = 1; j <= (2 * i + 1); j++) System.out.print("*");
            System.out.println();
        }
    }
    public void drawDiamond(int n){
        System.out.println("-----Diamond-----");
        //drawIsoscelesTriangle(n);
        for(int i=0;i<n;i++) {
            for (int k = ((n/2)+ 1);k>=i; k--) System.out.print(" ");
            for (int j = 1; j <= (2 * i + 1); j++) System.out.print("*");
            System.out.println();
        }
        for(int i=1;i<n;i++) {
            for (int k = 0; k<=((i/2)+ 1); k++) System.out.print(" ");
            for (int j = (2/ i + 1); j>=i ; j--) System.out.print("*");
            System.out.println();
        }
    }
    public void drawDiamondWithName(int n){
        System.out.println("-----Diamond With Name-----");
        for(int i=0;i<n-1;i++) {
            for (int k = ((n/2)+ 1);k>=i; k--) System.out.print(" ");
            for (int j = 1; j <= (2 * i + 1); j++) System.out.print("*");
            System.out.println();
        }
        System.out.println("hello");
        for(int i=1;i<n;i++) {
            for (int k = 0; k<=((i/2)+ 1); k++) System.out.print(" ");
            for (int j = (2/ i + 1); j>=i ; j--) System.out.print("*");
            System.out.println();
        }
    }
}
