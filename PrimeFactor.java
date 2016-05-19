/**
 * Created by nvankaya on 5/19/16.
 */
import java.util.*;
public class PrimeFactor {
    ArrayList<Integer> primefactors=new ArrayList<Integer>();
    ArrayList<Integer> generate(int n){
        boolean prime;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                prime=checkPrime(i);
                if(prime==true) {
                    primefactors.add(i);
                }
            }
        }
        return primefactors;
    }
    boolean checkPrime(int p){
        int count=0;
        for(int j=2;j<Math.sqrt(p);j++) {
            if (p % j == 0) {
                count++;
            }
        }
        if(count>0) {
            return false;
        }
        else {
            return true;
        }
    }
}
