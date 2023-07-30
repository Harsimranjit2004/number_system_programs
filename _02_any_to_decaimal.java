package number_system;

import java.util.Scanner;

public class _02_any_to_decaimal{
    public static int anyConversion(int n, int base){
        int rw = 0;
        int p = 1;
        while(n>0){
            int digit = n%10;
            n = n/10;
            rw += digit*p;
            p = p*base;
            
        }
        
        return rw;

    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int base = sc.nextInt();
        int dig = anyConversion(n, base);
        System.out.println(dig);

    }


}