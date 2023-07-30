package number_system;
import java.util.Scanner;
public class _06_any_base_multiplication {
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
    public static int productbyone(int b, int n1, int d2){
        int rv = 0 ;
        int c = 0;
        int p =1;
        while(n1>0|| c>0){
            int d1 = n1%10;
            n1 = n1/10;
            int d = d1*d2+c;
            c = d/b;
            d  = d%b;
            rv = rv+p;
            p = p*10;
        }
        return rv;
    }
    public static int multiplication(int base, int n1,int n2){
        int rv = 0 ;
        int p = 1;
        while(n2>0){
            int d2 = n2%10;
            n2 = n2 /10;
            int sprd = productbyone(base,n1,d2);
            rv = getSum(base, rv, sprd*p);
            p = p*10;
        }
        return rv;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int dig = multiplication(base, n1, n2);
        System.out.println(dig);
    }

}
