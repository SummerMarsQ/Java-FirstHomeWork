import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char");
        char ch = sc.nextLine().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o')
        {
            System.out.println("Char-ul "+ch+ " este o vocala");
        }
        else
        {
            System.out.println("Char-ul "+ch+ " este o consoana");
        }
    }
}