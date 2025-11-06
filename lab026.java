import java.util.Scanner;
public class lab026{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first quiz score");
        Float a = sc.nextFloat();
        System.out.println("Enter your second quiz score");
        Float b = sc.nextFloat();
        System.out.println("Enter your third quiz score");
        Float c = sc.nextFloat();
        int d = 100;
        int e = 60;
        int f = 40;
        Float g = (a+b+c)/3*f/d;
        System.out.println("Enter your final score");
        Float h = sc.nextFloat();
        Float k = h*e/d;
        Float m = g+k;
        System.out.printf("Your final grade is %s :" , m );

    }
}