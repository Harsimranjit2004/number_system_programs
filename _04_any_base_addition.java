package number_system;

import java.util.Scanner;

import javax.swing.UIDefaults.ProxyLazyValue;

public class _04_any_base_addition {
   
    public static int getSum(int base,int n1,int n2){
        int rw = 0;
        int c = 0;
        int p = 1;
        while(n1>0 || n2>0||c>0){
            int d1 = n1%10;
            int d2 = n2%10;
            n1 = n1/10;
            n2  = n2/10;
            int d = d1+d2+c;
            c = d/base;
            d = d%base;
            rw+= d*p;
            p = p*10;

        }
        return rw;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int no1 = sc.nextInt();
        int no2 = sc.nextInt();

        int base = sc.nextInt();
        int d = getSum(base, no1, no2);
        System.out.println(d);
    }
}
