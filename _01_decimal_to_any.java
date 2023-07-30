package number_system;
import java.util.Scanner;

public class _01_decimal_to_any {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int no  = sc.nextInt();
        int base = sc.nextInt();
        int c_no = decimal_conversion(no,base);
        System.out.println(c_no);

    }
    public static int decimal_conversion(int no, int baseno){
        int c_no = 0;
        
        int power = 1;
        while(no>0){
            c_no += power*no;
            power = power*10;

        }
        
        return c_no;
    }
}
