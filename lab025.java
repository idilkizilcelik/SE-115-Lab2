public class lab025 {
    public static void main(String [] args){
        int x = 3;
        int y = x++ + ++x + x--;
        System.out.println("x = " + x + ", y = " + y);
    }
}
