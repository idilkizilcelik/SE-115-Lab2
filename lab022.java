import java.util.Scanner;
public class lab022 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a value");
        int a = sc.nextInt();
        float b = 100;
        float c = a/3%b;
        int d = a/3/100;
        System.out.printf("Every friend will be have %d lira and %s kurus:", d, c);





    }
}