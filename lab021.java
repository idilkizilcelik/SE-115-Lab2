import java.util.Scanner;
public class lab021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = input.next();
        System.out.println("enter your age:");
        int age = input.nextInt();
        System.out.printf("This is your name %s and this is your age %02d",name,age);
    }
}