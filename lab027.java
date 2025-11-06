import java.util.Scanner;
public class lab027{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Please write a Celcius value to convert Fahrenheit");
        int a = sc.nextInt();
        int b = a*9/5+32;
        System.out.printf("Fahrenheit value is : %s" , b );

    }
}