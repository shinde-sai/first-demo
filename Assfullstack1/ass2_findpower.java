import java.util.*;
public class ass2_findpower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base of the number:");
        double base = sc.nextDouble();
        System.out.println("enter the exponent of the number:");
        double exponent = sc.nextDouble();

        double result = Math.pow(base,(exponent));
        System.out.println("base:"+base+"\n"+"exponent:"+exponent);
        System.out.println("power of the given number is:"+result);
    }    
}
