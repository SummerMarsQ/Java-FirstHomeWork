import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int sum = 0;
        if(n<=0){
            System.out.println("Sum = " +sum);
        }

        do{

            sum+=n;
            n--;
        }while(n != 0);
        System.out.println("Sum = "+sum);
    }
}