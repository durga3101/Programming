/**
 * Created by nvankaya on 5/19/16.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class PrimeFactorDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PrimeFactor primefactor = new PrimeFactor();
        System.out.println(primefactor.generate(N));
    }
}
