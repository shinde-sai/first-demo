import java.util.Scanner;

class ass1_interest{

    public static void culculate(){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the principle amount:");
        double primeamount = sc.nextDouble();
        System.out.println("enter the rate:");
        double rate = sc.nextDouble();
        System.out.println("enter the years:");
        double years =sc.nextDouble();
        System.out.println("enter the money:");
        double time = sc.nextDouble();

        double simpleinterest = primeamount * rate * years /100;
        System.out.println("simple interest is:"+simpleinterest);

        double compoundinterest = primeamount * Math.pow((1+rate/years),years*time);
        System.out.println("compound year is:"+compoundinterest);
    }
    public static void main(String args[]){
        ass1_interest.culculate();
    }
}