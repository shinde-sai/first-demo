import java.util.*;

public class ass3_swapping {

    public static void swapped1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("----------------");
        System.out.println("before swapping the numbers:");
        System.out.println("fist number is:"+num1);
        System.out.println("fist number is:"+num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("---------------------------");
        System.out.println("after swapping the number:");
        System.out.println("fist number is:"+num1);
        System.out.println("second number is:"+num2);
    }
    public static void swapped2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fist number:");
        int num1 = sc.nextInt();
        System.out.println("enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("--------------------------");
        System.out.println("before swapping the number:");
        System.out.println("first number is:"+num1);
        System.out.println("second number is:"+num2);
    }
    public static void swapbyvalue(int a,int b){
        int temp = a;
            a = b ;
            b = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("print the first number:");
        int num1 = sc.nextInt();
        System.out.println("enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("----------------------");
        System.out.println("before swapping the number;");
        System.out.println("first number is:"+num1);
        System.out.println("second number is:"+num2);

        ass3_swapping.swapbyvalue(num1,num2);

        System.out.println("-----------------------------");
        System.out.println("after swappoing the number :");
        System.out.println("first number is;"+num1);
        System.out.println("second number is:"+num2);
    }
}
