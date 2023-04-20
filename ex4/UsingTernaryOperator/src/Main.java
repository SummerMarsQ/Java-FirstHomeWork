import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        String message;
        message = num <= 0 ? "small" : "";
        if(message.equals(""))
        message = num >= 1000000 ? "large" : "";

        System.out.println("Number " + num + " is "+message);
    }
}