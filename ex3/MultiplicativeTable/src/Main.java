import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for multiplicative table ");
        int n = sc.nextInt();

        for(int i = 0 ; i <11 ; i++)
            System.out.println(n + " x " + i + " = " + n*i);
    }
}