package number_system;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.RunElement;

public class _03_any_to_any {
    public static int anyConversion(int n, int base){
        int rw = 0;
        int p = 1;
        while(n>0){
            int digit = n%10;
            n = n/10;
            rw = digit*p;
            p = p*10;
            
        }
        
        return rw;

    }
    public static int decimal_conversion(int no, int baseno){
  
        int rw  = 0;
        int power = 1;
        while(no>0){
            int dig = no%baseno;
            no = no/baseno;
            rw+=dig*power;
            power = power*10;
            

        }
        
        return rw;
    }
    public static int any_to_any(int n , int base1, int base2){
        int dec = anyConversion(n, base1);
        int value = decimal_conversion(dec, base2);

        return value;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int base1 = sc.nextInt();
        int base2 = sc.nextInt();
         
        int ans = any_to_any(n, base1 , base2);
        System.out.println(ans);
    }
}
